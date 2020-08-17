package com.example.domain;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Zzwen on 2019/11/29 15:42
 */
public class ClassA implements Iterable<ClassA> {
    @Override
    public Iterator<ClassA> iterator() {
        return this.iterator();
    }

    @Override
    public void forEach(Consumer<? super ClassA> action) {

    }

    @Override
    public Spliterator<ClassA> spliterator() {
        return null;
    }
}
