package ru.job4j.array;

import java.util.Arrays;

/**
 * Удаление дубликатов в массиве
 * @author vzernov
 * @version 1
 * @since 24.11.2018
 */
public class ArrayDuplicate {

    /**
     *
     * @param array входящий массив
     * @return обрезанный массив
     */
    public String[] removeDuplicates(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int inner = out + 1; inner < unique; inner++) {
                if (array[out].equals(array[inner])) {
                    array[inner] = array[unique - 1];
                    unique--;
                    inner--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}