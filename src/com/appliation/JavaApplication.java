package com.appliation;

import java.util.ArrayList;
import java.util.Collections;

import com.application.model.Employee;

public class JavaApplication {

	public static void main(String[] args) {

		ArrayList<Employee> ae = new ArrayList<>();
		
		ae.add(new Employee(1, "C"));
		ae.add(new Employee(2, "B"));
		ae.add(new Employee(3, "A"));
		ae.add(new Employee(4, "D"));
		
		Collections.sort(ae, (emp1,emp2)->  emp1.getEmpName().compareTo(emp2.getEmpName()));
		
		System.out.println(ae);
		
		
		
		
		
	}

}
