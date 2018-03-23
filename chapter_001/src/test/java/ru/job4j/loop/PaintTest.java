package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author vzernov
 * @version 1
 * @since 23.03.2018
 */
public class PaintTest {
    /**
     * Тест пирамиды высотой 2
     */
    @Test
    public void whenPyramidHeightIsTwo() {
        Paint paint = new Paint();
        String rst = paint.pyramid(2);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add(" ^ ")
                                .add("^^^")
                                .toString()
                )
        );
    }

    /**
     * Тест пирамиды высотой 3
     */
    @Test
    public void whenPyramidHeightIsThree() {
        Paint paint = new Paint();
        String rst = paint.pyramid(3);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("  ^  ")
                                .add(" ^^^ ")
                                .add("^^^^^")
                                .toString()
                )
        );
    }
}