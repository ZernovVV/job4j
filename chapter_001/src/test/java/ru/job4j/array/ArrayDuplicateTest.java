package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

/**
 * @author vzernov
 * @version 1
 * @since 24.11.2018
 */
public class ArrayDuplicateTest {
    /**
     * тест удаления дубликатов в массиве
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expect = {"Привет", "Мир", "Супер"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.removeDuplicates(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}