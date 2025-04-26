package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    @DisplayName("Sum values from 5 to 10; expectedResult = 45")
    void whenStart5AndFinish10Then45() {
        int start = 5;
        int finish = 10;
        int expectedResult = 45;
        int actualResult = Counter.sum(start, finish);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Sum values from 0 to 10; expectedResult = 55")
    void whenStart0AndFinish10Then55() {
        int start = 0;
        int finish = 10;
        int expectedResult = 55;
        int actualResult = Counter.sum(start, finish);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Sum values from 3 to 8; expectedResult = 33")
    void whenStart3AndFinish8Then33() {
        int start = 3;
        int finish = 8;
        int expectedResult = 33;
        int actualResult = Counter.sum(start, finish);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Sum values from 1 to 1; expectedResult = 1")
    void whenStart1AndFinish1Then1() {
        int start = 1;
        int finish = 1;
        int expectedResult = 1;
        int actualResult = Counter.sum(start, finish);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Start value more then finish value; expectedResult = 0")
    void whenStart10AndFinish5Then0() {
        int start = 10;
        int finish = 5;
        int expectedResult = 0;
        int actualResult = Counter.sum(start, finish);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Start value is negative and finish value is positive")
    void whenStartMinus5AndFinish10Then40() {
        int start = -5;
        int finish = 10;
        int expectedResult = 40;
        int actualResult = Counter.sum(start, finish);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("When start and finis are negative values")
        void whenStartMinus10AndFinishMinus5ThenMinus45() {
        int start = -10;
        int finish = -5;
        int expectedResult = -45;
        int actualResult = Counter.sum(start, finish);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("When start and finis are negative values and start more then finish; expectedResult = 0")
    void whenStartMinus5AndFinishMinus15Then0() {
        int start = -5;
        int finish = -15;
        int expectedResult = 0;
        int actualResult = Counter.sum(start, finish);
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
