package cn.bestlang.algs.concurrent;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class MyAtomicIntegerTest {

    @Test
    void getAndIncrement() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1000);
        ExecutorService executorService = Executors.newCachedThreadPool();
        MyAtomicInteger integer = new MyAtomicInteger();
        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> {
                integer.getAndIncrement();
                latch.countDown();
            });
        }

        latch.await();
        assertEquals(1001, integer.getAndIncrement());
    }
}