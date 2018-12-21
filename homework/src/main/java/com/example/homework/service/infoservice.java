package com.example.homework.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface infoservice {
    int saveInfo();
    String queryallinfo();

}
