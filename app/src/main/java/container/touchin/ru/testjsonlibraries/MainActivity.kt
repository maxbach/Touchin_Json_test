package container.touchin.ru.testjsonlibraries

import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.bluelinelabs.logansquare.LoganSquare
import com.bluelinelabs.logansquare.ParameterizedType
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private lateinit var parseButton: View
    private lateinit var json: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        parseButton = findViewById(R.id.parse_button)
        parseButton.setOnClickListener {
            findViewById<TextView>(R.id.parse_result).text = listOf(
                "Moshi" to doMoshi(),
                "LoganSquare" to doLogansquare(),
                "GSon" to doGson()
            ).sortedBy { it.second }
                .mapIndexed { index, pair -> "${index + 1}. ${pair.first} - ${pair.second}ms \n" }
                .reduce { acc, s -> acc + s }
        }
        val retrofit = Retrofit.Builder()
            .baseUrl("https://licard-server-mock.test.touchin.ru/")
            .build()
        val api = retrofit.create(StationsApi::class.java)
        api.getStationsSync().enqueue(object : Callback<ResponseBody> {

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                Toast.makeText(this@MainActivity, "NETWORK ERROR", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                json = response.body()?.string().orEmpty()
                parseButton.isVisible = true
            }

        })
    }

    private fun doGson(): Long {
        val begin = SystemClock.elapsedRealtime()
        val p = Gson().fromJson<BaseResponceMoshi<StatioListMoshi>>(
            json,
            object : TypeToken<BaseResponceMoshi<StatioListMoshi>>() {}.type
        )
        val end = SystemClock.elapsedRealtime()
        return end - begin
    }

    private fun doMoshi(): Long {
        val adapter = Moshi.Builder().build().adapter<BaseResponceMoshi<StatioListMoshi>>(
            Types.newParameterizedType(BaseResponceMoshi::class.java, StatioListMoshi::class.java)
        )
        val begin = SystemClock.elapsedRealtime()
        val p = adapter.fromJson(json)
        val end = SystemClock.elapsedRealtime()
        return end - begin
    }

    private fun doLogansquare(): Long {
        val begin = SystemClock.elapsedRealtime()
        val list = LoganSquare.parse(
            json,
            object : ParameterizedType<BaseResponse<StationListResponse>>() {}
        ).result?.stations.orEmpty()
        val end = SystemClock.elapsedRealtime()
        return end - begin
    }

}
