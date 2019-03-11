package ru.job4j.array;

/**
 * Массив заполнен true или false
 * @author vzernov
 * @version 1
 * @since 25.05.2018
 */
public class Check {
    /**
     * Проверяем, что все элементы в массиве являются true или false
     * @param data проверяемый массив
     * @return результат
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] != data[i + 1]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}