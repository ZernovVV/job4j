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
}