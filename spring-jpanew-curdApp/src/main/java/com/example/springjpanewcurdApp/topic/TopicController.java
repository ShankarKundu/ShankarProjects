package com.example.springjpanewcurdApp.topic;

import com.example.springjpanewcurdApp.ServiceClass.TopicService;
import com.example.springjpanewcurdApp.utils.CustomException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.val;
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

    @GetMapping("/topic/topicsGet/{id}")
    @ApiOperation(value = "Show Specific topics",
            notes ="This url used for Showing Indivisual Topic Value" )

    public Topic getTopic(@PathVariable String id){
        val optional = service.getTopic(id);
        if(optional.isPresent())
            return optional.get();

        throw new CustomException(400,"Topic Not Found","UI Side");
    }

    @PostMapping("/topic/topicsPut")
    @ApiOperation(value = "Inserting  topics",
            notes ="This url used for Inserting Topic" )
    public String addTopic(@RequestBody  Topic to){
        service.addTopic(to);
        return "Inserting Successfully";
    }

    @PutMapping(value = "/topic/topicsUpdate/{id}")
    @ApiOperation(value = "Updating topics",
            notes ="This url used for Upadting Topic Value with the help of specific id" )
    public void updateTopic(@PathVariable("id")  String id,@RequestBody Topic top){
        service.update(id,top);
    }

    @DeleteMapping(value = "/topic/topicsDelete/{id}")
    @ApiOperation(value = "Deleting topics",
            notes ="This url used for Specific Topic by Ids" )
    public String deleteTopic(@PathVariable("id") String id ){
        service.delete(id);
        return "Deleted Successfully";
    }

}
