package com.first.application.springcore;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {
    void print(){
        System.out.println("Constructor Injection Bean");
    }
}
