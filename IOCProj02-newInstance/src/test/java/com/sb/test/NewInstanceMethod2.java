package com.sb.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethod2 {

	public static void main(String[] args) throws Exception{		
		//load classed
				Class c1 = Class.forName(args[0]);
				//gets the all constructors of loaded classes
				Constructor cons[] = c1.getDeclaredConstructors();
				//dynamic object creation using 0-param constructor
				Object obj1 = cons[0].newInstance();
				System.out.println(obj1);
				//dynamic object creation using 2-param constructor
				Object obj2 = cons[1].newInstance(100,"india");
				System.out.println(obj2);
	}

}
