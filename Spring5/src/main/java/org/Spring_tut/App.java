package org.Spring_tut;

import org.Spring_tut.CarClass.*;
import org.Spring_tut.Interface.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		Car bmw = new BMW();
		Car tesla = new Tesla();
		
		System.out.println(bmw.spec());
		System.out.println(tesla.spec());
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car c = context.getBean("bmw", Car.class);
		System.out.println(c.spec());
		
		context.close();
	}
	
}
