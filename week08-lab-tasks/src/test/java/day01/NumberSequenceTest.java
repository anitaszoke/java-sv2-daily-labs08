package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class NumberSequenceTest {
    List<Integer> numberList = Arrays.asList(1, 3, 9, 15, 26, 28, 50);

    @Test
    void numberSequenceTest() {
        NumberSequence numberSequence = new NumberSequence(numberList);
        assertEquals(15, numberSequence.getNumberList().get(3));
    }

    @Test
    void numberSequenceRandomTest() {
        NumberSequence numberSequence = new NumberSequence(numberList);
        assertEquals(7, numberSequence.getNumberList().size());
    }
}

