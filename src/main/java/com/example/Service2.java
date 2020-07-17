package com.example;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.el.FixedValue;
import org.camunda.bpm.engine.impl.el.JuelExpression;

public class Service2 implements JavaDelegate {

    private JuelExpression myfield;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("3: " + delegateExecution.getVariable("myvar"));
        System.out.println("myfield: " + myfield.getExpressionText());
        System.out.println("myfield: " + myfield.getValue(delegateExecution));
    }
}
