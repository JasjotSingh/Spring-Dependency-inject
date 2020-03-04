package org.Spring_tut.CarClass;

import org.Spring_tut.Interface.Car;
import org.springframework.stereotype.Component;

@Component("bmw")
public class BMW implements Car{
	public String spec() {
		return "this is a BMW car.";
	}
}
