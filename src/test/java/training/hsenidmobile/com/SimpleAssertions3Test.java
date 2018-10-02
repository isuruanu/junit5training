package training.hsenidmobile.com;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleAssertions3Test {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Initializing before all tests.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Cleaning up after all tests.");
    }

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
