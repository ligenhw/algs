package cn.bestlang.algs.interview;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * https://www.iteye.com/blog/yunchow-2277593
 */
public class SlidingWindowRateLimiter {

    private int block;
    private int limit;
    private AtomicLong[] countPerBlock;
    private AtomicLong count;
    private volatile int index;
    private long timeStamp;

    public SlidingWindowRateLimiter(int block, int limit) {
        this.block = block;
        this.limit = limit;

        countPerBlock = new AtomicLong[block];
        for (int i = 0 ; i< block ; i++) {
            countPerBlock[i] = new AtomicLong();
        }
        count = new AtomicLong(0);
        timeStamp = System.currentTimeMillis();

        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(this::slide, 1, 1, TimeUnit.SECONDS);
    }

    private void slide() {
        index = (index + 1) % block;
        // 由于窗口大小不变 始终为数组长度 。index + 1 即为循环队列尾部下标
        long val = countPerBlock[index].getAndSet(0);
        System.out.println("slide val " + val);
        // 去掉尾部计数
        count.addAndGet(-val);
        System.out.println("slide count " + count.get());
        timeStamp = System.currentTimeMillis();
    }

    public boolean tryAcquire() {
        if (count.get() < limit) {
            long now = System.currentTimeMillis();
            int second = (int) ((now - timeStamp) / 1000);
            System.out.println("tryAcquire  second : " + second + ", " + index);
            countPerBlock[index + second].incrementAndGet();
            count.incrementAndGet();
            return true;
        }
        return false;
    }

}
