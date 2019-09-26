package org.wso2.bpmn.helloworld.v1;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
/**
 *  Hello World Service Task- V1.
 */
public class HelloWorldServiceTaskV1 implements JavaDelegate {

	public void execute(DelegateExecution arg0) throws Exception {
        System.out.println("Hello World ...!!!");
 
    }
}
