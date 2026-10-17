package com.example.sddtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void greets() {
        assertEquals("Hello from SDDTest", App.greeting());
    }
}
