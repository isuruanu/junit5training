package training.hsenidmobile.com.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
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
