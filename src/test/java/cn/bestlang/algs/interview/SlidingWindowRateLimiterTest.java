package cn.bestlang.algs.interview;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowRateLimiterTest {

    @Test
    void tryAcquire() throws InterruptedException {
        SlidingWindowRateLimiter limiter = new SlidingWindowRateLimiter(20, 3);
//        for (;;){
//            boolean b = limiter.tryAcquire();
//            System.out.println(new Date() + ", " + b);
//            TimeUnit.SECONDS.sleep(2);
//        }
    }
}