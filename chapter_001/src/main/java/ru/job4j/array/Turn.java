package ru.job4j.array;

/**
 * Переворот массива
 * @author vzernov
 * @version 1
 * @since 16.05.2018
 */
public class Turn {
    /**
     * переворачиваем массив
     * @param array переворачиваемый массив
     * @return возвращаем перевёрнутый массив
     */
    public int[] turn(int[] array) {
        int target = array.length - 1;
        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[target];
            array[target] = temp;
            target--;
        }
        return array;
    }
}