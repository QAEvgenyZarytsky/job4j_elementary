package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    void whenPoints00And20Then2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double expectedResult = 2.0;
        double actualResult = p1.distance(p2);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point p1 = new Point(-1, -1);
        Point p2 = new Point(1, 1);
        double expectedResult = 2.83;
        double actualResult = p1.distance(p2);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point p1 = new Point(-2, -2);
        Point p2 = new Point(2, 2);
        double expectedResult = 5.66;
        double actualResult = p1.distance(p2);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }

    @Test
    void whenPoints11AndMinus2AndMinus2Then4Dot24() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(-2, -2);
        double expectedResult = 4.24;
        double actualResult = p1.distance(p2);
        assertThat(actualResult).isEqualTo(expectedResult, withPrecision(0.01));
    }
}
