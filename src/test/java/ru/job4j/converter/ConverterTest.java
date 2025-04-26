package ru.job4j.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConverterTest {
    @Test
    void whenConvert140RblThen2Euro() {
        float input = 180;
        float expected = 2;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    @DisplayName("Convert 225 RUB to USD; expectedResult = 3 USD")
    void whenConvert225RblThen3Dollar() {
        float input = 225;
        float expected = 3;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Disabled("At the moment no handling of negative values")
    @Test
    @DisplayName("Count of RUB is negative value; expectedResult = Error")
    void whenConvertMinus1225RblThenError() {
        float input = -1225;
        String expected = "Some Error";
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
    }
}