package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в диапазоне
 * @author vzernov
 * @since 17.03.2018
 * @version 1
 */
public class Counter {
    /**
     * Суммирование
     * @param start начало диапазона
     * @param finish конец диапазона
     * @return сумма чётных чисел в диапазоне
     */
    public int add(int start, int finish) {
        int res = 0;
        for (int i = start; i <= finish; i++) {
           if (i % 2 == 0) {
               res += i;
           }
        }
        return res;
    }
}