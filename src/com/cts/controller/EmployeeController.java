package com.cts.controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Account;
import com.cts.model.Employee;

public class EmployeeController {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("spring-config.xml");
		Object obj=context.getBean("emp");
		Employee e=(Employee)obj;
		
		System.out.println("EmployeeId : "+e.getEmployeeId());
		System.out.println("emp name : "+e.getEmployeeName());
		System.out.println("Email id : "+e.getEmailId());
		System.out.println("Contact Number : "+e.getContactNumber());
		System.out.println("---------------------------------------------------");
		List<Account> ac=e.getAccount();
		for(Account acc:ac)
		{
			System.out.println("Account Number :"+acc.getAccountNumber());
			System.out.println("Account HolderName : "+acc.getAccountHolderName());
			System.out.println("---------");
		}
	}

}
