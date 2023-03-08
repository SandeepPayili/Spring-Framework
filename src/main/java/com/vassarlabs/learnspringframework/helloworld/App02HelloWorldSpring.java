package com.vassarlabs.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		// 1: Launch a Spring Context
		
		try(var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){

			// 2: Configure the things that we want Spring to manage -
			// HelloWorldConfiguration   - @Configuration
			// name - @Bean
			
			// 3: Retrieving Beans Managed by Spring
			System.out.println(context.getBean("name")); 
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("address2"));
			
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean(Address.class)); // we can also use type as parameter. 
			// this may give error if there are many beans returning Address class.
			
			
			
			// to get the all beans available in Spring Container
			 String[]  bean_names = context.getBeanDefinitionNames();
			 for(String bean : bean_names) {
				 System.out.println(bean);
			 }
			 
			 
			// to get the count of beans available in Spring COntainer
			 System.out.println("Beans Count :" + context.getBeanDefinitionCount()); // count will include inbuilt spring beans
			 
			 // to get Bean Definition 
			 System.out.println(context.getBeanDefinition("person"));
			 
			 System.out.println(context.getBean("person4Parameters"));
			 
			 System.out.println(context.getBean("person5SameBeanNameWithoutPrimary"));
			 
			 System.out.println(context.getBean("person6Qualifier"));
		}
		
		 
	}
}

// Spring Context, Spring Container,IOC Container all these refer to same thing.
// Any Java Object is POJO


// In Java, the try-with-resources statement is a try statement that declares one or more resources.
//The resource is as an object that must be closed after finishing the program. The try-with-resources statement ensures that each resource is closed at the end of the statement execution.

