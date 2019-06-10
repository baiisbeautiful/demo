package com.example.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/10 14:21
 **/
@Component
@ConfigurationProperties(prefix = "girl")
public class Girl {
    private String name;
    private String cupSize;
    private int age;

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
