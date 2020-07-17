package com.example;

import io.micronaut.context.annotation.Context;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyService {

    public String hello(DelegateExecution exection) {
        System.err.println("hello");
        return "hello";
    }

    public void print(DelegateExecution exection) {
        System.err.println("result: " + exection.getVariable("myvar"));
    }
}
