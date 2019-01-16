package container.touchin.ru.testjsonlibraries

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StationInfoMoshi(
    @Json(name = "id")
    @SerializedName( "id")
    val id: String = "",

    /**
     * Название
     */
    @Json(name = "name")
    @SerializedName("name")
    val name: String = "",

    /**
     * Номер
     */
    @Json(name = "number")
    @SerializedName("number")
    val number: String? = null,

    /**
     * Идентификатор региона
     */
    @Json(name = "regionId")
    @SerializedName("regionId")
    val regionId: String = "",

    /**
     * Виды топлива
     */
    @Json(name = "fuelIds")
    @SerializedName("fuelIds")
    val fuelIds: List<String> = emptyList(),

    /**
     * Способы оплаты
     */
    @Json(name = "paymentIds")
    @SerializedName("paymentIds")
    val paymentIds: List<String> = emptyList(),

    /**
     * Услуги
     */
    @Json(name = "serviceIds")
    @SerializedName("serviceIds")
    val serviceIds: List<String> = emptyList(),

    /**
     * Свойства
     */
    @Json(name = "propertyIds")
    @SerializedName("propertyIds")
    val propertyIds: List<String> = emptyList(),

    /**
     * Программы лояльности
     */
    @Json(name = "loyaltyProgramIds")
    @SerializedName("loyaltyProgramIds")
    val loyaltyProgramIds: List<String> = emptyList(),

    /**
     * Информация по картам «Рапида»
     */
    @Json(name = "rapidaInfoIds")
    @SerializedName("rapidaInfoIds")
    val rapidaInfoIds: List<String> = emptyList(),

    /**
     * Информация по акциям
     */
    @Json(name = "azsPromoIds")
    @SerializedName("azsPromoIds")
    val azsPromoIds: List<String> = emptyList(),

    /**
     * Информация по топливным картам
     */
    @Json(name = "oilCardIds")
    @SerializedName("oilCardIds")
    val oilCardIds: List<String> = emptyList(),
    /**
     * Адрес
     */
    @Json(name = "address")
    @SerializedName("address")
    val address: String = "",

    /**
     * Широта
     */
    @Json(name = "latitude")
    @SerializedName("latitude")
    val latitude: Double = 0.toDouble(),

    /**
     * Долгота
     */
    @Json(name = "longitude")
    @SerializedName("longitude")
    val longitude: Double = 0.toDouble()
)
