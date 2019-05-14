package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


/**
 * Расстояние между точками в системе координат
 * @author vzernov
 * @since 26.02.2018
 * @version 1
 */
public class Point {
    /**
     * Поле объекта (координаты по оси X), доступно только конкретному объекту
     */
    private int x;
    /**
     * Поле объекта (координаты по оси Y), доступно только конкретному объекту
     */
    private int y;
    /**
     * Поле объекта (координаты по оси Z), доступно только конкретному объекту
     */
    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * расстояние между точками
     * @param that координаты второй точки
     * @return расстояние между точками
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }
}