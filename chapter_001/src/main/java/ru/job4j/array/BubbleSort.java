package ru.job4j.array;

/**
 * Сортировка массива методом перестановки
 * @author vzernov
 * @version 1
 * @since 25.05.2018
 */
public class BubbleSort {
    /**
     * сортируем массив методом "пузырька"
     * @param array сортируемый массив
     * @return возвращаем отсортированный массив
     */
    public int[] sort(int[] array) {
        for (int out = (array.length - 1); out >= 1; out--) {
            for (int internal = 0; internal < out; internal++) {
                if (array[internal] > array[internal + 1]) {
                    int temp = array[internal];
                    array[internal] = array[internal + 1];
                    array[internal + 1] = temp;
                }
            }
        }
        return array;
    }
}