package com.example.lock;

/**
 * @author Zzwen
 * @date 2020-8-11 14:57
 */
public class LockTest {

    private static int num = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int j = 0; j < 100; j++) {
                    num++;
                }
            }).run();
        }
        System.out.println(num);
    }

}
