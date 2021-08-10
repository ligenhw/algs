package cn.bestlang.algs.leetcode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FooBar {

    private boolean isFoo = true;
    private Lock lock = new ReentrantLock();
    private Condition fooCond = lock.newCondition();
    private Condition barCond = lock.newCondition();

    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();

            try {
                while (!isFoo) {
                    fooCond.await();
                }

                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();

                isFoo = false;
                barCond.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();

            try {
                while (isFoo) {
                    barCond.await();
                }

                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();

                isFoo = true;
                fooCond.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }
}
