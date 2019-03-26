package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author vzernov
 * @version 1
 * @since 24.03.2019
 */
public class MergeTest {
    /**
     * Тест объединения двух отсортированных массивов
     */
    @Test
    public void whenMergeTwoArraysAndSort() {
        Merge merged = new Merge();
        int[] a = new int[] {1, 3};
        int[] b = new int[] {2, 4};
        int[] result = merged.merge(a, b);
        int[] expect = new int[] {1, 2, 3, 4};
        assertThat(result, is(expect));
    }

    /**
     * Тест объединения двух отсортированных массивов, первый массив длиннее
     */
    @Test
    public void whenMergeTwoArraysAndSortWhenFirstArrayLonger() {
        Merge merged = new Merge();
        int[] a = new int[] {1, 3, 7, 14, 30, 77, 78, 100, 108, 256};
        int[] b = new int[] {1, 2, 4, 9, 13, 45, 84};
        int[] result = merged.merge(a, b);
        int[] expect = new int[] {1, 1, 2, 3, 4, 7, 9, 13, 14, 30, 45, 77, 78, 84, 100, 108, 256};
        assertThat(result, is(expect));
    }

    /**
     * Тест объединения двух отсортированных массивов, второй массив длиннее
     */
    @Test
    public void whenMergeTwoArraysAndSortWhenSecondArrayLonger() {
        Merge merged = new Merge();
        int[] a = new  int[] {0, 2, 3, 5, 8, 11, 17};
        int[] b = new  int[] {1, 2, 4, 7, 8, 9, 10, 17, 23, 27, 28};
        int[] result = merged.merge(a, b);
        int[] expect = new int[] {0, 1, 2, 2, 3, 4, 5, 7, 8, 8, 9, 10, 11, 17, 17, 23, 27, 28};
        assertThat(result, is(expect));
    }
}