package org.hygorp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @DisplayName("should return a 3x3 matrix")
    void shouldReturn3x3Matrix() {
        int[][] matrix = {
                {9, 8, 7},
                {6, 5, 1},
                {2, 3, 4}
        };

        Assertions.assertEquals("[9, 8, 7, 1, 4, 3, 2, 6, 5]", Main.traverseSnailMatrix(matrix));
    }

    @Test
    @DisplayName("should return a 4x4 matrix")
    void shouldReturnA4x4Matrix() {
        int[][] matrix = {
                {1, 2, 3, 6},
                {5, 4, 7, 8},
                {9, 7, 4, 1},
                {3, 6, 9, 8}
        };

        Assertions.assertEquals("[1, 2, 3, 6, 8, 1, 8, 9, 6, 3, 9, 5, 4, 7, 4, 7]", Main.traverseSnailMatrix(matrix));
    }
}
