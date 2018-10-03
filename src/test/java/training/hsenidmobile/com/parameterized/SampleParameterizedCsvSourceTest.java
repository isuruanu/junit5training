package training.hsenidmobile.com.parameterized;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleParameterizedCsvSourceTest {

    @ParameterizedTest
    @CsvSource(value = {"ABCD, abcd", "ABC, abc", ",", "A, a"})
    public void testUpperCase(String capitalized, String input) {
        assertEquals(capitalized, input.toUpperCase());
    }

    @DisplayName("Checking length() method of String class")
    @ParameterizedTest(name = "Assertion # {index} => Length of {1} should be {0}")
    @CsvSource(value = {"4, ABCD", "3, ABC", "0, ''", "1, A"})
    public void testUpperCase(int length, String input) {
        assertEquals(length, input.length());
    }

}
