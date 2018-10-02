package training.hsenidmobile.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SimpleAssertionsTest {

    @Test
    public void toUpperCase() {
        String value = "abcd".toUpperCase();
        assertNotNull(value);
        assertEquals("ABCD", value);
    }

    @Test
    public void containsCheck() {
        String str = "abcd";
        boolean isStartsWith = str.startsWith("cd");
        assertFalse(isStartsWith);
    }
}
