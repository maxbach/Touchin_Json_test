package container.touchin.ru.testjsonlibraries

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BaseResponceMoshi<T>(
    /**
     * Результат
     */
    @Json(name = "result")
    @SerializedName("result")
    val result: T? = null,

    /**
     * Описание ошибки
     */
    @Json(name = "errorMessage")
    @SerializedName("errorMessage")
    val errorMessage: String? = null
)
