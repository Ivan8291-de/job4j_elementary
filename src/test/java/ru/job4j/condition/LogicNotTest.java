package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LogicNotTest {

    @Test
    void whenIsEvenTrue() {
        int num = 10;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void isPositive() {
        int num = 10;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void notEven() {
        int num = 1;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void isNegative() {
        int num = -10;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    void notEvenAndPositive() {
        int num = -9;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void evenOrNegative() {
        int num = 10;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }
}