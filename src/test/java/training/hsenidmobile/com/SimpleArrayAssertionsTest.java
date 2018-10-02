package training.hsenidmobile.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleArrayAssertionsTest {


    @Test
    public void testStringSplit() {
        String str = "abc def ghi";
        String[] actual = str.split(" ");
        String[] excepted = new String[] {"abc", "def", "ghi"};
        Assertions.assertArrayEquals(excepted, actual);
    }

}
