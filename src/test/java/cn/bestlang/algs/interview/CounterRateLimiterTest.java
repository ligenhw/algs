package cn.bestlang.algs.interview;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CounterRateLimiterTest {

    @Test
    void tryAcquire() throws InterruptedException {
        CounterRateLimiter counterRateLimiter = new CounterRateLimiter(10000, 3);
        for (int i = 0; i < 4; i++){
            boolean b = counterRateLimiter.tryAcquire();
            System.out.println(new Date() + ", " + b);
        }
    }
}