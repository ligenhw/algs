package cn.bestlang.algs.interview;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CounterLimiterTest {

    @Test
    void acquire() throws InterruptedException {
        CounterLimiter counterLimiter = new CounterLimiter(1000, 10);
        while (true) {
            boolean acquire = counterLimiter.acquire();
            System.out.println("CounterLimiter : " + new Date() + ", " + acquire);
            TimeUnit.MICROSECONDS.sleep(10);
        }
    }

    @Test
    void acquire2() throws InterruptedException {
        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> System.out.println("test"), 0 , 1000, TimeUnit.MILLISECONDS);
        TimeUnit.SECONDS.sleep(60);
    }
}