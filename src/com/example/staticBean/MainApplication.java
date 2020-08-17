package com.example.staticBean;

/**
 * @author Zzwen
 * @date 2020-7-23 16:38
 */
public class MainApplication {
    public static void main(String[] args) {
        User user = User.builder()
                .name("zhangsan")
                .address("beijing")
                .build();

    }
}
