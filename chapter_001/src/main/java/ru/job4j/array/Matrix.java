package ru.job4j.array;

/**
 * Двухмерный массив
 * @author vzernov
 * @version 1
 * @since 31.05.2018
 */
public class Matrix {
    /**
     * Заполняем двухмерный массив
     * @param size размер массива
     * @return результат
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i != size; i++) {
            for (int j = 0; j != size; j++) {
                table [i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}