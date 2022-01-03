package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamsFileReaderTest {

    TeamsFileReader teamsFileReader;
    String pathString;
    String fileName;

    @BeforeEach
    void setUp() {
        pathString = "src/test/resources/";
        fileName = "football.dat";
        teamsFileReader = new TeamsFileReader();
    }

    @Test
    void getFileName() {
        assertEquals("football.dat", teamsFileReader.getFileName());
    }


    @Test
    void getNamePosition() {
        assertEquals(7, teamsFileReader.getNamePosition().getStart());
        assertEquals(22, teamsFileReader.getNamePosition().getEnd());
    }

    @Test
    void getValue1Position() {
        assertEquals(43, teamsFileReader.getValue1Position().getStart());
        assertEquals(45, teamsFileReader.getValue1Position().getEnd());
    }

    @Test
    void getValue2Position() {
        assertEquals(50, teamsFileReader.getValue2Position().getStart());
        assertEquals(52, teamsFileReader.getValue2Position().getEnd());
    }
}