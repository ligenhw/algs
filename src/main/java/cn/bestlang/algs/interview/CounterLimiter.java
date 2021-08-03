package cn.bestlang.algs.interview;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterLimiter {
    private int windowSize;
    private int limit;
    private AtomicInteger count = new AtomicInteger(0);

    public CounterLimiter(int windowSize, int limit) {
        this.windowSize = windowSize;
        this.limit = limit;

        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> {
            count.set(0);
            System.out.println(" ========= count set 0 =========");
                },
                0, windowSize, TimeUnit.MILLISECONDS);
    }

    public boolean acquire() {
        if (count.incrementAndGet() >= limit) {
            return false;
        } else {
            return true;
        }
    }
}
