package com.example;

import io.micronaut.context.annotation.Context;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.impl.el.FixedValue;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyService {

    public FixedValue fieldvar;

    public String hello(DelegateExecution exection) {
        // TODO: Null-Pointer in the next line. Bug?
        System.err.println("hello: " + fieldvar.getExpressionText());
        return "hello";
    }

    public void print(DelegateExecution exection) {
        System.err.println("result: " + exection.getVariable("myvar"));
    }

    public FixedValue getFieldvar() {
        return fieldvar;
    }

    public void setFieldvar(FixedValue fieldvar) {
        this.fieldvar = fieldvar;
    }
}
