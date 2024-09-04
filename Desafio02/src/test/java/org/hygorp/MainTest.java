package org.hygorp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @DisplayName("should return RICO")
    void shouldReturnRICO() {
        Assertions.assertEquals("RICO", Main.drawingAttempt(10, 5, 5, 3, 7, 7));
    }

    @Test
    @DisplayName("should return MORTO")
    void shouldReturnMORTO() {
        Assertions.assertEquals("MORTO", Main.drawingAttempt(1, 5, 5, 1, 7, 7));
    }

    @Test
    @DisplayName("should throws exception")
    void shouldThrowsException() {
        Assertions.assertThrows(RuntimeException.class, () -> Main.drawingAttempt(-1, 5, 5, 1, 7, 7));
        Assertions.assertThrows(RuntimeException.class, () -> Main.drawingAttempt(-1, 5, 5, 1002, 7, 7));
    }
}
