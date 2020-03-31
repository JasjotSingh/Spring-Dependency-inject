package org.Spring_tut.CarClass;

import org.Spring_tut.Interface.BodyType;
import org.Spring_tut.Interface.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Tesla implements Car{
	@Autowired
	Engine eng;
	
	@Autowired
	@Qualifier("sportsCar")
	BodyType body;
	
	//new Engine can be used by making a call to the function, or but marking it as autowired.
	//though will need the Engine object to be marked as a component before.
	//using the following (and not chaning eng.type in specs) will set the eng object to value = "new Tesla Battery type".
	//since only one object is being initialized, even  BMW will have same value.
	//	@Autowired
	//	public void newEngine(Engine eng) {
	//		eng.setType("new Tesla Battery type");
	//		this.eng.type = eng;
	//	}
	
	//all constructors will run by default, 
	//initlized by AnnotationConfigApplicationContext in main method.
	//in case constructor needs(as argument) an object of another class marked as Component(annotation), then the required object class,
	//is initilized before then the other class is initilized.
	//in case of a deadlock, eg class one constructor requires class two object as argument, and class 2 requires class 1,
	//object as argument, this will cause a crash.
	
	public String spec() {
		this.eng.type = "new Tesla electric";
		String specStr = "This is a Tesla car. engine: "+eng.getType()+" , body type: "+body.bodyType();
		return specStr;
	}
}
