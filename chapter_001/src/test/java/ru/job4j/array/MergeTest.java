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
}
