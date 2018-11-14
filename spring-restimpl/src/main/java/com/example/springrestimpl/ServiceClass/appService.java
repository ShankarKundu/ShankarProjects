package com.example.springrestimpl.ServiceClass;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
public class appService {
    @Value("${val}")
    String name;


}
