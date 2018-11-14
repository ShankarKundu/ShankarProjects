package com.example.springrestimpl.topic;

import lombok.Data;

import java.beans.ConstructorProperties;

@Data

public class Topic {
    private int id;
    private String name;
    private String des;

    public Topic() {
        System.out.println("Topic");
    }

    public Topic(int id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }
}
