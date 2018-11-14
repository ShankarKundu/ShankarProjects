package com.example.springjpanewcurdApp.ServiceClass;

import com.example.springjpanewcurdApp.Repositary.TopicRepositary;
import com.example.springjpanewcurdApp.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {

    @Autowired
    private TopicRepositary topicRepositary;



    public List<Topic> getAllTopic(){
        return topicRepositary.getAllTopics();

    }
    public List<Topic> getAllNameStartsWithName(String name){
        return topicRepositary.getAllTopicsByName(name);
    }

    public List<String> getAllName() {
        return topicRepositary.getAllNames();
    }

    public List<String> getAllIds() {
        return topicRepositary.getAllIds();
    }


    public List<String> getAllDescription() {
        return topicRepositary.getAllDescription();
    }


    public void insert(Topic topic) {
        topicRepositary.save(topic);
    }
}
