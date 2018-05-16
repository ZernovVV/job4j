package ru.job4j.array;

/**
 * Поиск перебором
 * @author vzernov
 * @version 1
 * @since 18.04.2018
 */
public class FindLoop {
    /**
     * Ищем индекс элемента в массиве
     * @param data заданный массив элементов
     * @param el значение искомого элемента
     * @return индекс искомого элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}