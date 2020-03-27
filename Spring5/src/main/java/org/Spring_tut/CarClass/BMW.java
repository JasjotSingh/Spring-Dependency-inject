package org.Spring_tut.CarClass;


import org.Spring_tut.Interface.BodyType;
import org.Spring_tut.Interface.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bmw")
public class BMW implements Car{
	
	
	Engine eng;
	
	String name;
	
	//in following case where autowired can use to implementations,
	// LuxaryCar or SportsCar (only in case of interfaces), either keep the name of variable same as ,
	// desired component class(this case luxaryCar - > LuxaryCar) or use the Annotation Qualifier.
	//in case of constructor dependency injection, look at BMW constructor
	//in case of setter use simillar to below.
//	@Autowired
//	BodyType luxaryCar;
	
//	@Autowired
//	@Qualifier("luxaryCar")
	BodyType body;
	//new Engine can be used by making a call to the function, or but marking it as autowired.
	//though will need the Engine object to be marked as a component before.
	@Autowired
	public void newEngine(Engine eng) {
		eng.setType("new V10 type");
		this.eng = eng;
	}
	
	
	
	@Autowired
	public BMW(@Qualifier("luxaryCar") BodyType body) {
		//all constructors will run by default, 
		//initlized by AnnotationConfigApplicationContext in main method.
		//in case constructor needs(as argument) an object of another class marked as Component(annotation), then the required object class,
		//is initilized before then the other class is initilized.
		//in case of a deadlock, eg class one constructor requires class two object as argument, and class 2 requires class 1,
		//object as argument, this will cause a crash.
		name = "BMWW";
		
		this.body = body;
		
	}
	
	
	public String spec() {
		
		String specStr = "This is a BMW car. engine: "+eng.getType()+" , body type: "+body.bodyType();
		return specStr;
		
	}
}
