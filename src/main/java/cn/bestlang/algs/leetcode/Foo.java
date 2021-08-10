package cn.bestlang.algs.leetcode;

import java.util.concurrent.CountDownLatch;

public class Foo {

    private CountDownLatch firstLatch = new CountDownLatch(1);
    private CountDownLatch secondLatch = new CountDownLatch(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();

        firstLatch.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        firstLatch.await();

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();

        secondLatch.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        secondLatch.await();

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
