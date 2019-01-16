package container.touchin.ru.testjsonlibraries

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StatioListMoshi(
    @Json(name = "stations")
    @SerializedName( "stations")
    val stations: List<StationInfoMoshi> = emptyList()
)
