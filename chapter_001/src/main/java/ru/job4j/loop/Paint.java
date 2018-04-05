package ru.job4j.loop;

import java.util.function.BiPredicate;


/**
 * Построение пирамиды в псевдографике
 * @author vzernov
 * @version 1
 * @since 23.03.2018
 */
public class Paint {
    /**
     * Строим правую часть пирамиды
     * @param height высота пирамиды
     * @return результат
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Строим левую часть пирамиды
     * @param height высота пирамиды
     * @return результат
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Строим пирамиду
     * @param height высота пирамиды
     * @return результат
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Универсальный метод для построения пирамид
     * @param height высота пирамиды
     * @param weight ширина пирамиды
     * @param predict условие проставление галки
     * @return результат
     */
    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}