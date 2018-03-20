package ru.job4j.loop;

/**
 * Вычисляем факториал
 * @author vzernov
 * @since 19.03.2018
 * @version 1
 */
public class Factorial {
    /**
     * факториал
     * @param n положительное целое число
     * @return факториал n
     */
    public int calc(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}