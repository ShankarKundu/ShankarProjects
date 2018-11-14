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

    private List<Topic> topics=new ArrayList<>();

    public List<Topic> getAllTopic(){
      //  return topics;
        List<Topic> topics=new ArrayList<>();
        //Automaticallysave to darby DB
        topicRepositary.findAll().forEach(topics::add);
        return topics;


    }
    public Optional<Topic> getTopic(String id){

        //return  topics.stream().filter(i->i.getId()==id).findFirst().get();
    return topicRepositary.findById(id);
    }

    public void addTopic(Topic to){
        //save is predefine
        topicRepositary.save(to);

    }

    public void update(String id,Topic top){
        topicRepositary.save(top);
    }

    public void delete(String id) {
        topicRepositary.deleteById(id);
    }
}
