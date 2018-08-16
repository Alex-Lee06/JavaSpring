package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// The class path XML needs to be created before running this application.
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessages();

	}

}
