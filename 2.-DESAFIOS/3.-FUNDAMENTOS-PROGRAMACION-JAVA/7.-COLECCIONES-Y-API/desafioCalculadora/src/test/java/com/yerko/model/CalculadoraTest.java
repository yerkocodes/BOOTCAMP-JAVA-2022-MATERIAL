package com.yerko.model;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    public static Logger logger = Logger.getLogger("com.yerko");
    Calculadora calculadora = new Calculadora();
    static Float a;
    static Float b;

    @BeforeAll
    static void setUp() {
        a = 10.0F;
        b = 5.0F;
        logger.info("Iniciando clase CalculadoraTest");
    }

    @BeforeEach
    void init() {
        logger.info("Iniciando metodo");
    }

    @AfterAll
    static void finish() {
        logger.info("Terminando clase de prueba");
    }

    @AfterEach
    void done() {
        logger.info("Terminando metodo de prueba");
    }

    @Test
    @DisplayName("Iniciando test de metodo restar")
    public void restarTest() {
        assertEquals(5.0F, calculadora.restar(a, b));
    }

    @Test
    @DisplayName("Iniciando test de metodo sumar")
    public void sumarTest() {
        assertEquals(15.0F, calculadora.sumar(a, b));
    }

    @Test
    @DisplayName("Iniciando test de metodo multiplicar")
    public void multiplicarTest() {
        assertEquals(50.0F, calculadora.multiplicar(a, b));
    }

    @Test
    @DisplayName("Iniciando test de metodo dividir")
    public void dividirTest() {
        assertEquals(2.0F, calculadora.dividir(a, b));
    }
}
