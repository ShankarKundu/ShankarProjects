package com.example.springjpanewcurdApp.Repositary;

import com.example.springjpanewcurdApp.topic.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface TopicRepositary extends JpaRepository<Topic,String> {

   List<Topic> getAllTopics();

    List<Topic>getAllTopicsByName(@Param("nm") String nm);


    List<String> getAllNames();

    List<String> getAllIds();
    List<String> getAllDescription();


}
