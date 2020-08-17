package com.example.generic.generator;

import com.example.generic.igenerator.Generator;

import java.util.Random;

/**
 * @author Zzwen
 * @date 2020-7-21 11:31
 */
public class StringGenerator implements Generator<String> {

    private String[] strings = new String[]{"test","hello","world","fine"};

    @Override
    public String next() {
        Random random = new Random();
        return strings[random.nextInt(strings.length)];
    }
}
