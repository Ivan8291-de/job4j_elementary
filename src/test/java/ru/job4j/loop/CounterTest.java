package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void sumZeroAndTen() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertEquals(expected, result);
    }

    @Test
    void sumMinusStartAndFinish() {
        int start = -3;
        int finish = 4;
        int result = Counter.sum(start, finish);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    void sumStartBolsheFinish() {
        int start = 5;
        int finish = 2;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    void whenSumEvenNumbersFromMinusThreeToFiveThenThirty() {
        int start = -3;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        assertEquals(expected, result);
    }

    @Test
    void whenSumEvenNumbersFromMinusTwoToFiveThenMinusThirty() {
        int start = -10;
        int finish = -2;
        int result = Counter.sumByEven(start, finish);
        int expected = -30;
        assertEquals(expected, result);
    }
}