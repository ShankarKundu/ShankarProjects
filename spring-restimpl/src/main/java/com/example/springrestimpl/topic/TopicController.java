package com.example.springrestimpl.topic;

import com.example.springrestimpl.ServiceClass.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService ser;

    @RequestMapping("/topics")
    public List<Topic> getAllTopic(){
        return ser.getAllTopic();
    }
    @RequestMapping("/topicsGet/{id}")
    public Topic getTopic(@PathVariable int id){
        return ser.getTopic(id);
    }
    @RequestMapping(value = "/topicsPut",method = RequestMethod.POST)
    public void addTopic(@RequestBody  Topic to){
        ser.addTopic(to);
    }
    @RequestMapping(value = "/topicsUpdate/{id}" , method = RequestMethod.PUT)
    public void updateTopic(@PathVariable  int id,@RequestBody Topic top){
        ser.update(id,top);
    }
    @RequestMapping(value = "/topicsDelete/{id} ",method =RequestMethod.DELETE )
    public void deleteTopic(@PathVariable int id ){
        ser.delete(id);
    }


}
