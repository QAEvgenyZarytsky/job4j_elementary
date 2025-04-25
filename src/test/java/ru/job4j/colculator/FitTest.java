package ru.job4j.colculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FitTest {
    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expectedResult = 69;
        double actualResult = Fit.womanWeight(input);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }
}
