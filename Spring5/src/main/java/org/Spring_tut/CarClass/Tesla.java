package org.Spring_tut.CarClass;

import org.Spring_tut.Interface.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tesla")
public class Tesla implements Car{
	@Autowired
	Engine eng;
	
	
	//all constructors will run by default, 
	//initlized by AnnotationConfigApplicationContext in main method.
	//in case constructor needs(as argument) an object of another class marked as Component(annotation), then the required object class,
	//is initilized before then the other class is initilized.
	//in case of a deadlock, eg class one constructor requires class two object as argument, and class 2 requires class 1,
	//object as argument, this will cause a crash.
	
	public String spec() {
		String specStr = "This is a Tesla car. engine: "+eng.getType();
		return specStr;
	}
}
