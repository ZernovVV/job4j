package ru.job4j.condition;

/**
 * Расстояние между точками в системе координат
 * @author vzernov
 * @since 26.02.2018
 * @version 1
 */
public class Point {
    /**
     * Координаты по оси X
     */
    private int x;
    /**
     * Координаты по оси Y
     */
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * расстояние между точками
     * @param that координаты второй точки
     * @return расстояние между точками
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
}