package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{1, 13, 22, 99, 45, 3, 6, 8, 11};
        int element = 10;
        int expectedResult = -1;
        int actualResult = FindLoop.indexOf(data, element);
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
