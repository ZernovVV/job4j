package ru.job4j.max;

/**
 * Максимум из двух чисел
 * @author vzernov
 * @since 10.03.2018
 * @version 1
 */
public class Max {

    /**
     *
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public int max(int first, int second) {
        return first < second ? second : first;
    }

    /**
     *
     * @param first первый аргумент
     * @param second второй аргумент
     * @param third третий аргумент
     * @return результат
     */
    public int max(int first, int second, int third) {
        return this.max((this.max(first, second)), third);
    }

}