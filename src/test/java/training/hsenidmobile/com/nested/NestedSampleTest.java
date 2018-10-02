package training.hsenidmobile.com.nested;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class NestedSampleTest {

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


    @Nested
    @DisplayName("For an empty string")
    class EmptyStringTest {

        @BeforeEach
        public void beforeEach(TestInfo testInfo) {
            System.out.println("Initializing test data for empty string " + testInfo.getDisplayName());
        }

        @Test
        @DisplayName("Upper case should be empty")
        void toUpperCase() {
            String value = "".toUpperCase();
            assertNotNull(value);
            assertEquals("", value);
        }

        @Test
        @DisplayName("Length should be 0")
        void lengthTest() {
            String str = "";
            assertTrue(str.length() == 0);
        }
    }

}
