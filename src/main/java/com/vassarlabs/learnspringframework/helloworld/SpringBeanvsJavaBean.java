// Java Bean   vs Spring Bean vs POJO

package com.vassarlabs.learnspringframework.helloworld;

import java.io.Serializable;

// any java object can be said as POJO.
class POJO{
	private String text;
	private int number;
	public String toString() {
		return text + " : " + number;
	}
}

// Java Bean has some restrictions
// EJB(Enterprise) introduced concept of java Bean 
// JavaBean has 3 restrictions
// 1.It should have no argument constructor
// 2.Having Getters and Setters
// 3.Serializable

// Serializable is an interface with no methods to implement.

class JavaBean implements Serializable{  // instance of this class will become javaBean
	
	//1. public no arg- constructor. //it will create automatically.
	public JavaBean() {
		
	}
	private String text;
	private int number;
	
	// 2. getters and setters
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}	
} 

// Anything managed by Spring can be termed as Spring Beans.