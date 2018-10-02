package training.hsenidmobile.com.parameterized;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SampleParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"ABCD", "ABC", "D", "DA"})
    public void lengthTest(String str) {
        boolean notEmpty = str.length() > 0;
        assertTrue(notEmpty);
    }

    @Test
    public void lenghtTest() {
        String str = "DEF";
        assertTrue(str.length() > 0);
    }

}
