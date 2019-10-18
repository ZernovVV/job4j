package ru.job4j.stragery;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author vzernov
 * @version 1
 * @since 18.10.2019
 */
public class TriangleTest {
    /**
     * печатается треугольник
     */
    @Test
    public void whenDrawSquare() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(new StringBuilder()
                .append("  ▲  ")
                .append(System.lineSeparator())
                .append(" ▲▲▲ ")
                .append(System.lineSeparator())
                .append("▲▲▲▲▲")
                .toString()
        ));
    }
}