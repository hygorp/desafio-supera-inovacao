package org.hygorp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @DisplayName("should return marrom preto preto dourado")
    void shouldReturnMarromPretoPretoDourado() {
        Assertions.assertEquals("marrom preto preto dourado", Main.decode("10 ohms"));
    }

    @Test
    @DisplayName("should return marrom preto vermelho dourado")
    void shouldReturnMarromPretoVermelhoDourado() {
        Assertions.assertEquals("marrom preto vermelho dourado", Main.decode("1k ohms"));
    }

    @Test
    @DisplayName("should return vermelho preto verde dourado")
    void shouldReturnVermelhoPretoVerdeDourado() {
        Assertions.assertEquals("vermelho preto verde dourado", Main.decode("2M ohms"));
    }

    @Test
    @DisplayName("should return exception")
    void shouldReturnInvalidFormatError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.decode("1.4 ohms"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.decode("1/7k ohms"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.decode("1/7m ohms"));
    }
}
