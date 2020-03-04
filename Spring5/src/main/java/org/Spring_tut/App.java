package org.Spring_tut;

import org.Spring_tut.CarClass.*;
import org.Spring_tut.Interface.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
//		using the following right now will cause null point exception in tesla and BMW class.
//		because we are using autowired in those classes to initilize Engine class, 
//		when using spring and creating component programming, its important to follow spring methodology.
		
//		Car bmw = new BMW();
//		Car tesla = new Tesla();
//		
//		System.out.println(bmw.spec());
//		System.out.println(tesla.spec());
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car c = context.getBean("bmw", Car.class);
		System.out.println(c.spec());
		
		context.close();
	}
	
}
