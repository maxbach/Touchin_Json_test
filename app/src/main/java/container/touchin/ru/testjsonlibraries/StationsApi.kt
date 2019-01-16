package container.touchin.ru.testjsonlibraries

import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface StationsApi {

    @POST("common/station/list")
    fun getStationsSync(@Body body: RequestBody = RequestBody.create(MediaType.parse("application/json"), "{}")): Call<ResponseBody>

}
