package ru.job4j.array;

/**
 * Объединить два массива
 * @author vzernov
 * @version 1
 * @since 24.03.2019
 */
public class Merge {
    /**
     * @param left  первый отсортированный массив для объединения
     * @param right второй отсортированный массив для объединения
     * @return возвращает отсортированный объединенный массив
     */
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, index = 0;
        while (i < left.length || j < right.length) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    result[index] = left[i];
                    i++;
                } else {
                    result[index] = right[j];
                    j++;
                }
            } else if (i < left.length) {
                result[index] = left[i];
                i++;
            } else if (j < right.length) {
                result[index] = right[j];
                j++;
            }
            index++;
        }
        return result;
    }
}