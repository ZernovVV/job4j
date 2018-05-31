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
        boolean result = false;
            for (int i = 1; i < data.length; i++) {
                if (data[i] != data[i - 1]) {
                    break;
                } else {
                    if (i == (data.length - 1)) {
                        result = true;
                    }
                }
            }
        return result;
    }
}