package org.sanelib.eboss.core.activities.demo;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.sanelib.eboss.core.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstProcessDelegate implements JavaDelegate {

    @Autowired
    EmployeeRepository employeeRepository;


	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("First Process is called");
        System.out.println("Employee repository:" + employeeRepository);
		execution.setVariable("firstParam", "firstParamVal");
	}
}