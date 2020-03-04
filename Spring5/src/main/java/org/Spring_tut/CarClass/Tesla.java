package org.Spring_tut.CarClass;

import org.Spring_tut.Interface.Car;
import org.springframework.stereotype.Component;

@Component("tesla")
public class Tesla implements Car{
	public String spec() {
		return "This is a Tesla car.";
	}
}
