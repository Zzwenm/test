package com.example.staticBean;

/**
 * @author Zzwen
 * @date 2020-7-23 16:31
 */
public class User {

    private String name;

    private String address;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    static User.Builder builder(){
        return new User.Builder();
    }
    public static class Builder {

        private String name;

        private String address;

        Builder(){}

        User.Builder name(String name){
            this.name = name;
            return this;
        }

        User.Builder address(String address){
            this.address = address;
            return this;
        }

        User build(){
            return new User(this.name,this.address);
        }

    }

}
