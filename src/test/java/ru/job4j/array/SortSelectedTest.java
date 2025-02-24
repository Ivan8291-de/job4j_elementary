package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {31, 18, 9, 21, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 9, 18, 21, 31};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {561, 264, 37};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {37, 264, 561};
        assertThat(result).containsExactly(expected);
    }
}