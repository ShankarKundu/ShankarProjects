package com.example.springjpanewcurdApp.Repositary;

import com.example.springjpanewcurdApp.topic.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepositary extends JpaRepository<Topic,String> {



}
