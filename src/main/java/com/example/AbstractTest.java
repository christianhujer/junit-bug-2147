package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

abstract class AbstractTest {
    @Test
    void test() {
        fail("bar");
    }
}
