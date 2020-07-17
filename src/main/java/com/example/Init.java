package com.example;

import io.micronaut.context.annotation.Context;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Context
public class Init {

    @Inject
    RuntimeService runtimeService;

    @PostConstruct
    public void init() {
        runtimeService.startProcessInstanceByKey("Process");
    }
}
