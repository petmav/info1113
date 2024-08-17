package test.java.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import processing.core.*;

import main.java.Test.JUnit;

// IN REGULAR ASSERTION METHODS (NOT JUNIT), YOU MUST USE 'assert' AND flag compiler with -source 1.4 or later,
// AND flag java runtime with -ea

public class TestJUnit {

    @Test
    public void testAdd() {
        JUnit test = new JUnit(1, 2);
        assertEquals(3, test.add());
    }

    @Test
    public void testSubtract() {
        JUnit test = new JUnit(1, 2);
        assertEquals(-1, test.subtract());
    }

    @Test
    public void testMultiply() {
        JUnit test = new JUnit(1, 2);
        assertEquals(1, test.multiply());
    }
    
}
