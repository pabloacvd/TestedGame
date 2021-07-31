package ar.com.xeven.testedgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class PersonajeTest {
    @Test
    public void puedeSeguirJugandoConUnaVida() {
        // Dado un contexto
        Personaje personaje = new Personaje();
        personaje.setVidas(1);

        // Si hago esto
        boolean puedeSeguirJugando = personaje.puedeSeguirJugando();

        // Espero esto
        assertTrue(puedeSeguirJugando);
    }

    @Test
    public void NoPuedeSeguirJugandoSiTieneCeroVidas() {
        // Arrange
        Personaje personaje = new Personaje();
        personaje.setVidas(0);

        // Act
        boolean puedeSeguirJugando = personaje.puedeSeguirJugando();

        // Assert
        assertFalse(puedeSeguirJugando);
    }

}

