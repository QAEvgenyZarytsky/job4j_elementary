package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class VectorTest {
    @Test
    void whenVectors12And34ThenResult45() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        String expectedResult = "(4, 6)";
        String actualResult = Vector.addVectors(x1, y1, x2, y2);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void whenVectorsMinus12And34ThenResult22() {
        int x1 = -1, y1 = -2, x2 = 3, y2 = 4;
        String expectedResult = "(2, 2)";
        String actualResult = Vector.addVectors(x1, y1, x2, y2);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void whenVectorsMinus12AndMinus34ThenResultMinus46() {
        int x1 = -1, y1 = -2, x2 = -3, y2 = -4;
        String expectedResult = "(-4, -6)";
        String actualResult = Vector.addVectors(x1, y1, x2, y2);
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
