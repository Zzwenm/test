package com.example.thread;

/**
 * @author Zzwen
 * @date 2020-8-12 15:10
 */
public class ThreadLive {

    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("MyRunnable");
            }
        }
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
            if(i==30){
                thread.start();
//                try{
//                    thread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }

    }

}
