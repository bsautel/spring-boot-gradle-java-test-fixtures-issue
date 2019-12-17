package com.example.application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NameComputerTest {
    private NameComputer nameComputer;

    @BeforeEach
    void setUp() {
        nameComputer = new NameComputer();
    }

    @Test
    void shouldComputeName() {
        String result = nameComputer.computeName();

        assertEquals("world", result);
    }
}
