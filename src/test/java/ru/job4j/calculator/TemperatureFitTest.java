package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TemperatureFitTest {
    @Test
    void whenRoomTemperature10ThenFruits8() {
        int input = 10;
        double expectedResult = 8.0;
        double actualResult = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }

    @Test
    void whenRoomTemperature10ThenMeat5() {
        int input = 10;
        double expectedResult = 5.0;
        double actualResult = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }
}
