package ru.job4j.array;

/**
 * Заполнение массива степенями чисел
 * @author vzernov
 * @version 1
 * @since 05.04.2018
 */
public class Square {
    /**
     * Заполняем массив
     * @param bound длина массива
     * @return результат
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}