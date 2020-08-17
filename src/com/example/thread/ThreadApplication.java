package com.example.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadApplication {

    private boolean flag = true;

    private int num = 0;

    private AtomicInteger atomicInteger = new AtomicInteger();

    private Lock lock = new ReentrantLock();

    private void increase() {
        lock.lock();
        try {
            this.num++;
//            atomicInteger.incrementAndGet()
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getThreadGroup());
        ThreadApplication threadApplication = new ThreadApplication();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    threadApplication.increase();
                }
            }).start();
        }

        while (Thread.activeCount() != 2) {
            Thread.yield();
        }
        System.out.println(threadApplication.num);

    }

}
