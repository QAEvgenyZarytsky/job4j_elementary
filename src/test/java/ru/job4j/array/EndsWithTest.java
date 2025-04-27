package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("When world equals one char; expectedResult is true")
    void whenWorld1ThenTrue() {
        char[] word = {'H'};
        char[] postfix = {'H'};
        boolean actualResult = EndsWith.endsWith(word, postfix);
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("When world equals one char; expectedResult is false")
    void whenWorld1ThenFalse() {
        char[] word = {'H'};
        char[] postfix = {'o'};
        boolean actualResult = EndsWith.endsWith(word, postfix);
        assertThat(actualResult).isFalse();
    }
}
