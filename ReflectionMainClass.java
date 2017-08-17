package com.test.reflection;

import java.lang.reflect.Method;

public class ReflectionMainClass {
	
	public static void main(String[] args) {
		System.out.println("Execution Started");
		try {
			Class<?> sampleClass = Class.forName("com.test.reflection.SampleClass");
			Method[] methods = sampleClass.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println("Methos available is : " + method);
			}
			for (Method method : methods) {
				if (method.getName().startsWith("setUp")) {
					method.invoke(new SampleClass(), new String [] {});
				}
			}
			for (Method method : methods) {
				if (method.getName().startsWith("test")) {
					method.invoke(new SampleClass(), new String [] {});
				}
			}
			for (Method method : methods) {
				if (method.getName().startsWith("tearDown")) {
					method.invoke(new SampleClass(), new String [] {});
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
