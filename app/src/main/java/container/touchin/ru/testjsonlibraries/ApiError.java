/*
 * This code is autogenerated by Touch Instinct tools
 */
package container.touchin.ru.testjsonlibraries;

import com.bluelinelabs.logansquare.annotation.JsonEnum;
import com.bluelinelabs.logansquare.annotation.JsonNumberValue;

/**
 * Код ошибки
 */
@JsonEnum
public enum ApiError {

    /**
     * Неверные параметры запроса.
     */
    @JsonNumberValue(-1)
    INVALID_PARAMETERS,

    /**
     * Внутренняя ошибка сервера.
     */
    @JsonNumberValue(-2)
    INTERNAL_SERVER_ERROR,

    /**
     * Успешный ответ.
     */
    @JsonNumberValue(0)
    VALID_RESPONSE,

    /**
     * Пользователь не найден.
     */
    @JsonNumberValue(1)
    SESSION_ID_NOT_FOUND,

    /**
     * Номер карты или пароль введены неверно.
     */
    @JsonNumberValue(2)
    CARD_NUMBER_OR_PASSWORD_INCORRECT,

    /**
     * Карта не найдена.
     */
    @JsonNumberValue(3)
    CARD_NOT_FOUND,

    /**
     * Номер карты или номер телефона введены неверно.
     */
    @JsonNumberValue(4)
    PHONE_MISMATCH,

    /**
     * Карта с данным номером уже зарегистрирована.
     */
    @JsonNumberValue(5)
    CARD_ALREADY_REGISTERED,

    /**
     * Номер телефона уже зарегистрирован другим пользователем.
     */
    @JsonNumberValue(6)
    PHONE_ALREADY_REGISTERED,

    /**
     * Недействительный номер карты.
     */
    @JsonNumberValue(7)
    CARD_NUMBER_INCORRECT,

    /**
     * Требуется пароль.
     */
    @JsonNumberValue(8)
    PASSWORD_REQUIRED,

    /**
     * Неверный код подтверждения.
     */
    @JsonNumberValue(9)
    CONFIRMATION_CODE_INCORRECT,

    /**
     * Регион не найден.
     */
    @JsonNumberValue(10)
    REGION_NOT_FOUND,

    /**
     * Пароль указан неверно.
     */
    @JsonNumberValue(11)
    PASSWORD_INCORRECT,

    /**
     * Транзакция не найдена.
     */
    @JsonNumberValue(12)
    TRANSACTION_NOT_FOUND,

    /**
     * Регистрация не найдена.
     */
    @JsonNumberValue(13)
    REGISTRATION_NOT_FOUND,

    /**
     * Операция не найдена.
     */
    @JsonNumberValue(14)
    OPERATION_NOT_FOUND,

    /**
     * Нет доступных виртуальных карт.
     */
    @JsonNumberValue(15)
    NO_VIRTUAL_CARDS_AVAILABLE,

    /**
     * Срок действия кода подтверждения истек.
     */
    @JsonNumberValue(16)
    CONFIRMATION_CODE_EXPIRED,

    /**
     * Карта уже подключена.
     */
    @JsonNumberValue(17)
    CARD_ALREADY_CONNECTED,

    /**
     * Достигнут лимит подключений для виртуальной карты.
     */
    @JsonNumberValue(18)
    CARD_LIMIT_REACHED,

    /**
     * Тариф не найден.
     */
    @JsonNumberValue(19)
    TARIFF_NOT_FOUND,

    /**
     * Операция недоступна для карт старой программы лояльности.
     */
    @JsonNumberValue(20)
    METHOD_NOT_AVAILABLE,

    /**
     * Слишком большое количество загружаемых файлов.
     */
    @JsonNumberValue(21)
    FILE_LIMIT_REACHED,

    /**
     * Категория не найдена.
     */
    @JsonNumberValue(22)
    OIL_CATEGORY_NOT_FOUND,

    /**
     * Марка не найдена.
     */
    @JsonNumberValue(23)
    OIL_MAKE_NOT_FOUND,

    /**
     * Модель не найдена.
     */
    @JsonNumberValue(24)
    OIL_MODEL_NOT_FOUND,

    /**
     * Тип не найден.
     */
    @JsonNumberValue(25)
    OIL_TYPE_NOT_FOUND,

    /**
     * Новость с данным идентификатором не найдена.
     */
    @JsonNumberValue(26)
    PROMO_NOT_FOUND,

    /**
     * Карта с данным идентификатором не зарегистрирована.
     */
    @JsonNumberValue(27)
    CARD_NOT_REGISTERED,

    /**
     * Изображение не найдено.
     */
    @JsonNumberValue(28)
    IMAGE_NOT_FOUND,

    /**
     * Недостаточно баллов.
     */
    @JsonNumberValue(29)
    NOT_ENOUGH_POINTS,

    /**
     * Ошибка АЗС. Попробуйте еще раз.
     */
    @JsonNumberValue(30)
    AZS_UNAVAILABLE,

    /**
     * Количество топлива не соответствует лимитам.
     */
    @JsonNumberValue(31)
    PRODUCT_QUANTITY_LIMITS,

    /**
     * Сумма заказа не соответствует лимитам.
     */
    @JsonNumberValue(32)
    PRODUCT_AMOUNT_LIMITS,

    /**
     * Заказ не оплачен.
     */
    @JsonNumberValue(33)
    ORDER_NOT_PAID,

    /**
     * Хотя бы 1 рубль не должен быть оплачен баллами.
     */
    @JsonNumberValue(34)
    ZERO_AMOUNT,

    /**
     * Неверный код заправочной сессии.
     */
    @JsonNumberValue(35)
    FUEL_SESSION_INCORRECT,

    /**
     * Заказа с данным идентификатором не найден.
     */
    @JsonNumberValue(36)
    ORDER_NOT_FOUND,

    /**
     * Ошибка оплаты.
     */
    @JsonNumberValue(37)
    PAYMENT_PROCESSING_ERROR,

    /**
     * Купон уже погашен.
     */
    @JsonNumberValue(38)
    COUPON_ALREADY_REDEEMED,

    /**
     * Купон не найден.
     */
    @JsonNumberValue(39)
    COUPON_NOT_FOUND,

    /**
     * Купон просрочен.
     */
    @JsonNumberValue(40)
    COUPON_EXPIRED,

    /**
     * Партнер не найден.
     */
    @JsonNumberValue(41)
    PARTNER_NOT_FOUND,

    /**
     * Тег не найден.
     */
    @JsonNumberValue(42)
    TAG_NOT_FOUND,

    /**
     * Оценка уже оставлена.
     */
    @JsonNumberValue(43)
    RATING_ALREADY_ADDED,

    /**
     * Купоны уже привязаны.
     */
    @JsonNumberValue(44)
    COUPONS_ALREADY_ASSIGNED,

    /**
     * Нет доступных купонов.
     */
    @JsonNumberValue(45)
    NO_COUPONS_AVAILABLE;

}