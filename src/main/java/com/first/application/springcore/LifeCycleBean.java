package com.first.application.springcore;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean {


    public LifeCycleBean(){
        System.out.println("Şuan constructor içerisindeyim");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Şu an postcontruct içindeyim.");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Şu an predestroy içindeyim. ");
    }

    public void print(){
        System.out.println("Print fonksiyonu içindeyim");
    }
}
