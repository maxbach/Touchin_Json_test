/*
 * This code is autogenerated by Touch Instinct tools
 */
package container.touchin.ru.testjsonlibraries;

import com.bluelinelabs.logansquare.annotation.JsonEnum;
import com.bluelinelabs.logansquare.annotation.JsonNumberValue;

/**
 * День недели
 */
@JsonEnum
public enum Weekday {

    /**
     * Понедельник
     */
    @JsonNumberValue(1)
    MONDAY,

    /**
     * Вторник
     */
    @JsonNumberValue(2)
    TUESDAY,

    /**
     * Среда
     */
    @JsonNumberValue(3)
    WEDNESDAY,

    /**
     * Четверг
     */
    @JsonNumberValue(4)
    THURSDAY,

    /**
     * Пятница
     */
    @JsonNumberValue(5)
    FRIDAY,

    /**
     * Суббота
     */
    @JsonNumberValue(6)
    SATURDAY,

    /**
     * Воскресенье
     */
    @JsonNumberValue(7)
    SUNDAY;

}