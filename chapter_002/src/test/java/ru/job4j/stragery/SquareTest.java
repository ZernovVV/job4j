package ru.job4j.stragery;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author vzernov
 * @version 1
 * @since 18.10.2019
 */
public class SquareTest {
    /**
     * печатается квадрат
     */
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringBuilder()
                .append("■■■■")
                .append(System.lineSeparator())
                .append("■■■■")
                .append(System.lineSeparator())
                .append("■■■■")
                .append(System.lineSeparator())
                .append("■■■■")
                .toString()
        ));
    }
}