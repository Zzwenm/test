package com.example.twoQueStack;

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueStack<T> {

    private Queue<T> q1 = new LinkedList<>();
    private Queue<T> q2 = new LinkedList<>();

    public void push(T t) {
        if (q1.isEmpty()) {
            q1.offer(t);
            while (!q2.isEmpty()) {
                T tmp = q2.poll();
                q1.offer(tmp);
            }
        } else {
            q2.offer(t);
            while (!q1.isEmpty()) {
                T tmp = q1.poll();
                q2.offer(tmp);
            }
        }
    }

    public T pop() {
        if (!q1.isEmpty()) {
            return q1.poll();
        } else {
            return q2.poll();
        }
    }


}
