package cn.bestlang.algs.interview;

public class CounterRateLimiter {

    private long timeStamp = System.currentTimeMillis();
    private long windowSize;
    private int limit;
    private int count;

    public CounterRateLimiter(long windowSize, int limit) {
        this.windowSize = windowSize;
        this.limit = limit;
    }

    public synchronized boolean tryAcquire() {
        long now = System.currentTimeMillis();
        if (now - timeStamp < windowSize) {
            if (count < limit) {
                count++;
                return true;
            } else {
                return false;
            }
        }

        timeStamp = now;
        count = 1;
        return true;
    }
}
