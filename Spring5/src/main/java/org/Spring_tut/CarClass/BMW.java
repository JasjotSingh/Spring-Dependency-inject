package org.Spring_tut.CarClass;

import org.Spring_tut.Interface.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bmw")
public class BMW implements Car{
	@Autowired
	Engine eng;
	
	public String spec() {
		String specStr = "This is a BMW car. engine: "+eng.getType();
		return specStr;
	}
}
