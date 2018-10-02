package training.hsenidmobile.com.handy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DisplayNameTest {

    @Test
    @DisplayName("When string length is null, throw NullPointerException")
    void test() {
        String str = null;
        assertThrows(NullPointerException.class, () -> {
            int length = str.length();
        });
    }

}
