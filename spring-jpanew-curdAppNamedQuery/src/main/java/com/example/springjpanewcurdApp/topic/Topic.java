package com.example.springjpanewcurdApp.topic;

import lombok.Data;




import javax.persistence.*;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "topics")
@NamedQueries({
        @NamedQuery( name = "Topic.getAllTopics",query = "select t from Topic t"),
        @NamedQuery(name = "Topic.getAllTopicsByName",query = "select t from Topic t WHERE t.name like CONCAT(:nm,'%')"),
        @NamedQuery(name = "Topic.getAllNames",query = "select t.name from Topic t")
})
@NamedNativeQueries({
        @NamedNativeQuery(name = "Topic.getAllIds", query = "SELECT id from topics"),
        @NamedNativeQuery(name = "Topic.getAllDescription", query ="select description from topics")
})
@Data
public class Topic {
    @Id
    @Column(name = "id")
    private String id=UUID.randomUUID().toString();

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public Topic() {
        System.out.println("Topic");
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
