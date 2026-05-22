package com.example.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGrade() {
        assertEquals("A", App.calculateGrade(85));
    }
}
