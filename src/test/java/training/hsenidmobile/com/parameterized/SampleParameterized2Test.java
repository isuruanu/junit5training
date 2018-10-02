package training.hsenidmobile.com.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleParameterized2Test {

    @ParameterizedTest
    @CsvSource(value = {"ABCD, abcd", "ABC, abc", ",", "A, a"})
    public void testUpperCase(String capitalized, String input) {
        assertEquals(capitalized, input.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value = {"4, ABCD", "3, ABC", "0, ''", "1, A"})
    public void testUpperCase(int length, String input) {
        assertEquals(length, input.length());
    }

}
