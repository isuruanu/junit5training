package training.hsenidmobile.com.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleParameterizedCsvSourceTest {

    @ParameterizedTest
    @CsvSource(value = {"ABCD, abcd", "ABC, abc", ",", "A, a"})
    public void testUpperCase(String capitalized, String input) {
        assertEquals(capitalized, input.toUpperCase());
    }

    @ParameterizedTest(name = "{1} length is {0}")
    @CsvSource(value = {"4, ABCD", "3, ABC", "0, ''", "1, A"})
    public void testUpperCase(int length, String input) {
        assertEquals(length, input.length());
    }

}
