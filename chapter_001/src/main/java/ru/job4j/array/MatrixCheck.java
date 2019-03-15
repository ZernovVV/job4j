package ru.job4j.array;

/**
 * @author vzernov
 * @version 1
 * @since 25.10.2018
 */
public class MatrixCheck {
    /**
     * Проверяем, что все элементы по диагоналям равны true или false
     * @param data проверяемый массив
     * @return результат
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
          for (int i = 0; i != data.length; i++) {
              if (data[0][0] != data[i][i] || data[0][data.length - 1] != data[i][data.length - 1 - i]) {
                  result = false;
                  break;
              }
          }
        return result;
    }
}