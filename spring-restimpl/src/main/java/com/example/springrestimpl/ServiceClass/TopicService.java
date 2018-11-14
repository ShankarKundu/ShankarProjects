package com.example.springrestimpl.ServiceClass;

import com.example.springrestimpl.topic.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics=new ArrayList<>(Arrays.asList(
                new Topic(1 ,"Spring framework","Sp des"),
                new Topic(2 ,"core java","basic des")
        ));

    public List<Topic> getAllTopic(){
        return topics;
    }
    public Topic getTopic(int id){
        /*Topic tp1=null;
        List<Topic> top=topics;
        for(Topic tp:top){
            if (tp.getId()==id){
                tp1=tp;
            }
        }
        return tp1;*/
        return  topics.stream().filter(i->i.getId()==id).findFirst().get();
    }

    public void addTopic(Topic to){
        topics.add(to);

    }

    public void update(int id,Topic top){
        for(int i=0;i<topics.size();i++){
            Topic t=topics.get(i);
            if(t.getId()==id){
                topics.set(i,top);
                return;
            }
        }
    }


    public void delete(int id) {
        /*for(int i=0;i<topics.size();i++){
            Topic t=topics.get(i);
            if(t.getId()==id){
                topics.remove(t);
                return;
            }
        }*/

        topics.removeIf(t->t.getId()==id );

    }
}
