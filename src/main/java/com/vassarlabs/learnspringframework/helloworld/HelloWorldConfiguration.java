package com.vassarlabs.learnspringframework.helloworld;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

// to eliminate verbosity in creating Java Beans
// Public accessor methods,constructor,
// equals,hashcode and toString are automatically created.
//Released in JDK 16.

record Person(String name,int age,Address address) {};

// Address  - firstLine & City
record Address(String firstLine,String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() { // default name of the bean is name of the method
		return "Sandeep Payili";
	}
	@Bean   
	public int age() {  // here age is the bean name
		return 21;
	}
	
	@Bean
	public Person person() {
		return new Person("Sandeep Payili",27,new Address("IIT ","Basar"));
	}
	
	// for internal dependencies we can achieve by method calls.
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person3Parameters(String name,int age,Address address3) { // passing bean names as parameters >> name,age,address3
		return new Person(name,age,address3);  
	} 
	
	@Bean 
	@Primary
	public Person person4Parameters(String name,int age,Address address) {// first primary bean then  it will look for matching bean name ,then if there is no matching bean then it will look for class type.
		return new Person(name,age,address);// if there are two beans of same class type but if we have passed different bean name than those two it will raise an exception.
	}
	
	@Bean
	public Person person5SameBeanNameWithoutPrimary(String name,int age,Address address_bean) { // instead of same bean name it will take primary bean if primary bean exists.
		return new Person(name,age,address_bean); 
	}
	
	
	@Bean
	public Person person6Qualifier(String name,int age,@Qualifier("address3qualifier") Address address3) {
		return new Person(name,age,address3);
	}
	
	@Bean
	public Address address_bean() {
		return new Address("OU","Telengana");
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() { // here bean name is address2
		return new Address("NALGONDA","Akaram");
	}
	
	@Bean(value="address3")
	@Qualifier("address3qualifier")
	public Address my_address() {
		return new Address("Mahdapur","Hyderabad");
	}
}
