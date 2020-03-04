package org.Spring_tut.CarClass;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	String type;
	
	Engine(){
		type = "V8";
	}
	
	public String getType() {
		return type;
	}
}
