package cn.bestlang.algs.leetcode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Foo2 {

    private Lock lock = new ReentrantLock();
    private int state;
    private Condition firstCond = lock.newCondition();
    private Condition secondCond = lock.newCondition();

    public Foo2() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();

            state = 1;
            firstCond.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try {

            while (state != 1) {
                firstCond.await();
            }

            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();

            state = 2;

            secondCond.signalAll();

        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            while (state != 2) {
                secondCond.await();
            }

            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        } finally {
            lock.unlock();
        }
    }
}
