package training.hsenidmobile.com.performance;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeOutTest {

    @Test
    public void performanceTest() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            int sum = 0;
           for(int i = 0; i < 10_00_000; i++) {
               sum  += i;
               System.out.println(sum);
           }
        });
    }

}
