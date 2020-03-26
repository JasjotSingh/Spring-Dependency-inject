package org.Spring_tut.CarClass;

import org.Spring_tut.AppConfig;
import org.Spring_tut.Interface.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("bmw")
public class BMW implements Car{
	
	
	Engine eng;
	
	String name;
	
	//new Engine can be used by making a call to the function, or but marking it as autowired.
	//though will need the Engine object to be marked as a component before.
	@Autowired
	public void newEngine(Engine eng) {
		eng.setType("new V10 type");
		this.eng = eng;
	}
	
	public BMW() {
		//all constructors will run by default, 
		//initlized by AnnotationConfigApplicationContext in main method.
		//in case constructor needs(as argument) an object of another class marked as Component(annotation), then the required object class,
		//is initilized before then the other class is initilized.
		//in case of a deadlock, eg class one constructor requires class two object as argument, and class 2 requires class 1,
		//object as argument, this will cause a crash.
		name = "BMWW";
	}
	
	
	public String spec() {
		
		String specStr = "This is a BMW car. engine: "+eng.getType();
		return specStr;
		
	}
}
