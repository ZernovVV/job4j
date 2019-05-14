package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author vzernov
 * @since 10.03.2018
 * @version 1
 */
public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstMoreSecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstEqualSecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstMax() {
        Max maxim = new Max();
        int result = maxim.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenSecondMax() {
        Max maxim = new Max();
        int result = maxim.max(2, 3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenThirdMax() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenAllEqual() {
        Max maxim = new Max();
        int result = maxim.max(7, 7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenFirstAndThirdMax() {
        Max maxim = new Max();
        int result = maxim.max(3, 1, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenFourthMax() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdOfFourMax() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }
    @Test
    public void whenSecondOfFourMax() {
        Max maxim = new Max();
        int result = maxim.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstOfFourMax() {
        Max maxim = new Max();
        int result = maxim.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenAllOfFourEquals() {
        Max maxim = new Max();
        int result = maxim.max(8, 8, 8, 8);
        assertThat(result, is(8));
    }
}