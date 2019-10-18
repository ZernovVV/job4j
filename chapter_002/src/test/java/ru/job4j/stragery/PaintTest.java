package ru.job4j.stragery;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author vzernov
 * @version 1
 * @since 18.10.2019
 */
public class PaintTest {
    /**
     * печатается квадрат
     */
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append("■■■■")
                .append(System.lineSeparator())
                .append("■■■■")
                .append(System.lineSeparator())
                .append("■■■■")
                .append(System.lineSeparator())
                .append("■■■■")
                .toString()
        ));
        System.setOut(stdout);
    }

    /**
     * печатается треугольник
     */
    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append("  ▲  ")
                .append(System.lineSeparator())
                .append(" ▲▲▲ ")
                .append(System.lineSeparator())
                .append("▲▲▲▲▲")
                .toString()
        ));
        System.setOut(stdout);
    }
}