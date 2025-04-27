package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expectedResult = 120;
        int number = 5;
        int actualResult = Factorial.calculate(number);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expectedResult = 1;
        int number = 0;
        int actualResult = Factorial.calculate(number);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("When number is 15")
    void whenCalculateFactorialForOneHundredThenFifteen() {
        long expectedResult = 2004310016;
        int number = 15;
        long actualResult = Factorial.calculate(number);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Number is one")
    void whenCalculateFactorialForOneThenIne() {
        int number = 1;
        int expectedResult = 1;
        int actualResult = Factorial.calculate(number);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Check throw IllegalArgumentException when number < 0")
    void whenCalculateFactorialForMinusFiveThenThrowsException() {
        int number = -5;
        assertThatThrownBy(() -> Factorial.calculate(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Number can not be negative value.");
    }
}
