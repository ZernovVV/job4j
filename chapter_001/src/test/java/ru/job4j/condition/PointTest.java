package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author vzernov
 * @since 29.03.2019
 * @version 1
 */
public class PointTest {
    /**
     * Расстояние между точками
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     * Считает расстояния до себя
     */
    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    /**
     * Тест вывода значения полей x и y
     */
    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }

    /**
     * Расстояние между точками в трёхмерном пространстве
     */
    @Test
    public void whenZeroAndTenThenTen3D() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 0, 10);
        double result = first.distance3d(second);
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     * Считает расстояния до себя трёхмерном пространстве
     */
    @Test
    public void whenCheckItself3D() {
        Point point = new Point(0, 0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }
}