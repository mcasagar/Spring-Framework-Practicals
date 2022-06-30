//working with newInstance() method of java.lang.reflect.Constructor class
package com.sb.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethod {

	public static void main(String[] args) throws Exception{
		//load classed
				Class c1 = Class.forName(args[0]);
				Class c2 = Class.forName(args[1]);
				
				//create the object of loaded class
				Object obj1 = c1.newInstance();
				Object obj2 = c2.newInstance();
				
				System.out.println(obj1.toString());
				System.out.println(obj2.toString());
			
	}

}
