package training.hsenidmobile.com.simple;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleAssertions2Test {

    @BeforeEach
    public void beforeEach(TestInfo testInfo) {
        System.out.println("Initializing test data for " + testInfo.getDisplayName());
    }

    @AfterEach
    public void afterEach(TestInfo testInfo) {
        System.out.println("Clean test data for " + testInfo.getDisplayName());
    }

    @Test
    public void toUpperCase() {
        String value = "abcd".toUpperCase();
        assertNull(value);
        assertEquals("ABCD", value);
    }

    @Test
    public void containsCheck() {
        String str = "abcd";
        boolean isStartsWith = str.startsWith("cd");
        assertFalse(isStartsWith);
    }
}
