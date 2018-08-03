package com.zy.vehiclerepairer.domain.model;

/**
 * @author shugui.zhang 2018/7/9 13:47
 */
public class Person {
    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
