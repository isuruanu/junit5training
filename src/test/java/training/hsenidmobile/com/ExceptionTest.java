package training.hsenidmobile.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    @Test
    void test() {
        String str = null;
        assertThrows(NullPointerException.class, () -> {
            int length = str.length();
        });
    }

}
