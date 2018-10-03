package training.hsenidmobile.com.parameterized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleParameterizedCsvFileTest {

    @DisplayName("Test length() method of String class")
    @ParameterizedTest(name = "{index} => length of {0} should be {1}")
    @CsvFileSource(resources = "/msisdn.csv")
    void testLength(String word, int length) {
        assertEquals(length, word.length());
    }

}
