package org.Spring_tut;


import org.Spring_tut.CarClass.Engine;
import org.Spring_tut.CarClass.LuxaryCar;
import org.Spring_tut.CarClass.SportsCar;
import org.Spring_tut.CarClass.Tesla;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.Spring_tut")
public class AppConfig {
	
		//Bean annotation can be used in place of Component annotation on each class in java files .
		//makes code more readable and all simillar code is collected in one place makes it more managable.
		// but in some case we can still use @Component annotaion in clsses or not. eg:
		//	1. look at class BMW where constructor is using another class object as argument.other way to do it here will be:
		//				@Bean("bmw")
		//				public BMW bmw() {
		//					return new BMW(new SportsCar());
		//				}
		//		above seems against component programming since we are creating an object for SportsCar.
		//
		// 2. using bean makes sense in case we are using external libraries where we can not add component annotaion
		//	  to the classes themselves.
	
		@Bean("sportsCar")
		public SportsCar sportsCar() {
			return new SportsCar();
		}
		
		@Bean("luxaryCar")
		public LuxaryCar luxaryCar() {
			return new LuxaryCar();
		}

		@Bean("engine")
		public Engine engine() {
			return new Engine();
		}
		
		@Bean("tesla")
		public Tesla tesla() {
			return new Tesla();
		}
}
