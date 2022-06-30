package com.sb.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethod3_setAccessible {

	public static void main(String[] args) throws Exception{		
		//load classed
				Class c1 = Class.forName(args[0]);
				//gets the all constructors of loaded classes
				Constructor cons[] = c1.getDeclaredConstructors();
				//dynamic object creation using 0-param constructor
				cons[0].setAccessible(true);
				Object obj1 = cons[0].newInstance();
				System.out.println(obj1);
				//dynamic object creation using 2-param constructor
				cons[1].setAccessible(true);
				Object obj2 = cons[1].newInstance(100,"india");
				System.out.println(obj2);
	}

}
