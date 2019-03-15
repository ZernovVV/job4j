package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author vzernov
 * @version 1
 * @since 25.10.2018
 */
public class MatrixCheckTest {
    /**
     * все элементы по диагоналям равны, нечетное количество элементов массива
     */
    @Test
    public void whenDataMonoByTrueThenTrueOdd() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * все элементы по диагоналям не равны, нечетное количество элементов массива
     */
    @Test
    public void whenDataNotMonoByTrueThenFalseOdd() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * все элементы по диагоналям равны, четное количество элементов массива
     */
    @Test
    public void whenDataNotMonoByTrueThenTrueEven() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, false},
                {false, true, false, true},
                {true, false, true, true},
                {false, false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * все элементы по диагоналям не равны, четное количество элементов массива
     */
    @Test
    public void whenDataNotMonoByTrueThenFalseEven() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false, true},
                {false, true, true, true},
                {true, true, true, true},
                {false, false, true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}