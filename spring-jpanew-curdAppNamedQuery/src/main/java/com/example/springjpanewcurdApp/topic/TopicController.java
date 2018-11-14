package com.example.springjpanewcurdApp.topic;

import com.example.springjpanewcurdApp.ServiceClass.TopicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Api(value = "Topic Structure",
        description = "This Urls is for getting Topic related service")
public class TopicController {

    @Autowired
    private TopicService service;

    @GetMapping("/topic/topics")
    @ApiOperation(value = "Show List of topics",
            notes ="This url used for Showing all the values in Topic Structure" )
    public List<Topic> getAllTopic(){
        return service.getAllTopic();
    }

    @GetMapping("topic/topics/{nm}")
    public List<Topic> getNameByName(@PathVariable String nm){
        return service.getAllNameStartsWithName(nm);
    }

    @GetMapping("topic/topics/onlyName")
    public List<String> getAllOnlyNames(){

        return service.getAllName();
    }

    @GetMapping("topic/topics/onlyId")
    public List<String> getAllIds(){
        return service.getAllIds();
    }

    @GetMapping("topic/topics/onlyDesciption")
    public List<String> getAllDescription(){
        return service.getAllDescription();
    }

    @PostMapping("topic/topics/ins")
    public String insertTopicsByNativeQuery(@RequestBody Topic topic){
        service.insert(topic);
        return "Successfully insertion";
    }

}
