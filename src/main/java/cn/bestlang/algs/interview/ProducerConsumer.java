package cn.bestlang.algs.interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {

    static class Producer {
        private int capital;
        private Queue<String> queue;
        private ReentrantLock lock;
        private Condition isFull;
        private Condition isEmpty;

        public Producer(
                Queue<String> queue,
                ReentrantLock lock,
                Condition isFull,
                Condition isEmpty,
                int capital
        ) {
            this.queue = queue;
            this.lock = lock;
            this.isFull = isFull;
            this.isEmpty = isEmpty;
            this.capital = capital;
        }

        public void produce(String data) {
            lock.lock();
            try {
                while (queue.size() == capital) {
                    long start = System.currentTimeMillis();
                    System.out.println(" produce block start");
                    isFull.await();
                    System.out.println(" produce block end, cost : " + (System.currentTimeMillis() - start) / 1000);
                }

                queue.add(data);
                isEmpty.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    static class Cusumer {
        private int capital;
        private Queue<String> queue;
        private ReentrantLock lock;
        private Condition isFull;
        private Condition isEmpty;

        public Cusumer(
                Queue<String> queue,
                ReentrantLock lock,
                Condition isFull,
                Condition isEmpty,
                int capital
        ) {
            this.queue = queue;
            this.lock = lock;
            this.isFull = isFull;
            this.isEmpty = isEmpty;
            this.capital = capital;
        }

        public String consume() {
            String data = null;
            lock.lock();
            try {
                while (queue.size() == 0) {
                    long start = System.currentTimeMillis();
                    System.out.println(" consume block start");
                    isEmpty.await();
                    System.out.println(" consume block end, cost : " + (System.currentTimeMillis() - start) / 1000);
                }

                data = queue.poll();
                isFull.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

            return data;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int capital = 10;
        Queue<String> queue = new LinkedList<>();
        ReentrantLock lock = new ReentrantLock();
        Condition isFull = lock.newCondition();
        Condition isEmpty = lock.newCondition();
        ExecutorService exec = Executors.newFixedThreadPool(2);

        Producer producer = new Producer(queue, lock, isFull, isEmpty, capital);
        Cusumer consumer = new Cusumer(queue, lock, isFull, isEmpty, capital);

        exec.execute(() -> {
            int i = 0;
            String data = "data";
            while (!Thread.interrupted()) {
                i++;
                System.out.println("produce : " + data + i);
                producer.produce(data + i);
                try {
                    TimeUnit.SECONDS.sleep(random.nextInt(3));
                } catch (InterruptedException e) {
                    System.out.println("producer break");
                    break;
                }
            }
        });
        exec.execute(() -> {
            while (!Thread.interrupted()) {
                String data = consumer.consume();
                System.out.println("consumer : " + data);
                try {
                    TimeUnit.SECONDS.sleep(random.nextInt(3));
                } catch (InterruptedException e) {
                    System.out.println("consumer break");
                    break;
                }
            }
        });

        TimeUnit.SECONDS.sleep(5);
        System.out.println("shutdownNow");
        exec.shutdownNow();
    }
}
