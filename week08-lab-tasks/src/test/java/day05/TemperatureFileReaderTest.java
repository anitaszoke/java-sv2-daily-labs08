package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureFileReaderTest {

    TemperatureFileReader temperatureFileReader;
    String fileName;
    String pathString;

    @BeforeEach
    void setUp() {
        pathString = "src/test/resources/";
        fileName = "weather.dat";
        temperatureFileReader = new TemperatureFileReader();
    }

    @Test
    void getFileName() {
        assertEquals("weather.dat", temperatureFileReader.getFileName());
    }

    @Test
    void getNamePosition() {
        assertEquals(2, temperatureFileReader.getNamePosition().getStart());
        assertEquals(4, temperatureFileReader.getNamePosition().getEnd());
    }

    @Test
    void getValue1Position() {
        assertEquals(6, temperatureFileReader.getValue1Position().getStart());
        assertEquals(8, temperatureFileReader.getValue1Position().getEnd());
    }

    @Test
    void getValue2Position() {
        assertEquals(12, temperatureFileReader.getValue2Position().getStart());
        assertEquals(14, temperatureFileReader.getValue2Position().getEnd());
    }
}