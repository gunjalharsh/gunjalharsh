package com.homeMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.homeTest.StudDemo;

public class main {

	public static void main(String[] args) {

		
		ApplicationContext ac1=new ClassPathXmlApplicationContext("applicationContext.xml");
		
    StudDemo sd=(StudDemo) ac1.getBean("studentbean");
    
    	sd.displayInfo();
	}

}
