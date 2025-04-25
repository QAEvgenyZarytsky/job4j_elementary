package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    void whenPoints00And20Then2() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expectedResult = 2.0;
        double actualResult = Point.distance(x1, y1, x2, y2);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        int x1 = -1, y1 = -1, x2 = 1, y2 = 1;
        double expectedResult = 2.83;
        double actualResult = Point.distance(x1, y1, x2, y2);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        int x1 = -2, y1 = -2, x2 = 2, y2 = 2;
        double expectedResult = 5.66;
        double actualResult = Point.distance(x1, y1, x2, y2);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }

    @Test
    void whenPoints11AndMinus2AndMinus2Then4Dot24() {
        int x1 = 1, y1 = 1, x2 = -2, y2 = -2;
        double expectedResult = 4.24;
        double actualResult = Point.distance(x1, y1, x2, y2);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }
}
