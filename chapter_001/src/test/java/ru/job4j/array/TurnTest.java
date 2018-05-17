package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author vzernov
 * @version 1
 * @since 16.05.2018
 */
public class TurnTest {
    /**
     * Переворот массива с четным количеством элементов
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = turner.turn(input);
        int[] expect = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    /**
     * Переворот массива с нечетным количеством элементов
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.turn(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}