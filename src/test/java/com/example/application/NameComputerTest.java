package com.example.application;

import static com.example.application.NameComputerFactory.createNameComputer;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NameComputerTest {
    private NameComputer nameComputer;

    @BeforeEach
    void setUp() {
        nameComputer = createNameComputer();
    }

    @Test
    void shouldComputeName() {
        String result = nameComputer.computeName();

        assertEquals("world", result);
    }
}
