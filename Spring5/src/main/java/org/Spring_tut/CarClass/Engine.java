package org.Spring_tut.CarClass;



public class Engine {
	String type;
	
	public Engine(){
		//all constructors will run by default, 
		//initlized by AnnotationConfigApplicationContext in main method.
		//in case constructor needs(as argument) an object of another class marked as Component(annotation), then the required object class,
		//is initilized before then the other class is initilized.
		//in case of a deadlock, eg class one constructor requires class two object as argument, and class 2 requires class 1,
		//object as argument, this will cause a crash.
		type = "V8";
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
