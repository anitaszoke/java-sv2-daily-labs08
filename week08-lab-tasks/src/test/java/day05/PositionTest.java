package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    Position position;
    String lineA;
    String lineB;

    @BeforeEach
    void setUp() {
        position = new Position(1, 2);
        lineA = "AB1";
        lineB = "A1B";
    }

    @Test
    void getStartTest() {
        assertEquals(1, position.getStart());
    }

    @Test
    void getEndTest() {
        assertEquals(2, position.getEnd());
    }

    @Test
    void getAsStringTest() {
        assertEquals("B", position.getAsString(lineA));
    }

    @Test
    void getAsIntTest() {
        assertEquals(1, position.getAsInt(lineB));

    }
}