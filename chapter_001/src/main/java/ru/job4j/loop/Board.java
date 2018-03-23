package ru.job4j.loop;

/**
 * Построение шахматной доски в псевдографике
 * @author vzernov
 * @version 1
 * @since 21.03.2018
 */
public class Board {
    /**
     * Построение доски
     * @param width ширина доски
     * @param height высота доски
     * @return сформированная доска в виде строки
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}