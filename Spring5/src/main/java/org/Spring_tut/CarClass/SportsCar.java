package org.Spring_tut.CarClass;

import org.Spring_tut.Interface.BodyType;
import org.springframework.stereotype.Component;


public class SportsCar implements BodyType {

	@Override
	public String bodyType() {
		return "Body_type: Sports";
	}

}
