package com.first.application.springcore;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {
    void print(){
        System.out.println("Field Injection Bean");
    }
}


