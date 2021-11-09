package com.ssm.pojo;

public class User {
    private String name;
    private int age;
    private String location;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
