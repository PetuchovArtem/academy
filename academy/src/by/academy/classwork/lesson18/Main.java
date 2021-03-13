package by.academy.classwork.lesson18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		// TODO Auto-generated method stub
		System.out.println("Cat-----------------------");
		Cat cat = new Cat("Kisa", "ArtiomForCat", 1);
		Class<? extends Cat> catClass = cat.getClass();
	

//getDeclaredConstructor
		Field[] declaredFieldsCats = catClass.getDeclaredFields();

		for (Field field : declaredFieldsCats) {
			System.out.println(field);
		}
	
		Constructor<?>[] declaredFieldsCats1 = catClass.getDeclaredConstructors();
		for (Constructor field : declaredFieldsCats1) {
			System.out.println(field);
		}
		
		
		Field ageField = catClass.getDeclaredField("age");
		ageField.setAccessible(true);
		System.out.println("Before change:" + ageField.get(cat));
		ageField.setAccessible(true);
		ageField.set(cat, 3);
		System.out.println("After change:" + ageField.get(cat));
		
		
		
		System.out.println("-----------------------");
		System.out.println("Tiger-----------------------");
		Tiger tiger = new Tiger("Tiger", "ArtiomForTiger", 2);
		Class<? extends Tiger> tigerClass = tiger.getClass();
		
		Field[] declaredFieldsTiger = tigerClass.getDeclaredFields();

		for (Field field : declaredFieldsTiger) {
			System.out.println(field);
		}

		Constructor<?>[] declaredFieldsTiger1 = tigerClass.getDeclaredConstructors();
		for (Constructor field1 : declaredFieldsTiger1) {
			System.out.println(field1);
		}
		
		Field petsName1 = tigerClass.getDeclaredField("petsName1");
		petsName1.setAccessible(true);
		System.out.println("Before change:" + petsName1.get(tiger));
		petsName1.setAccessible(true);
		petsName1.set(tiger, "NewTiger");
		System.out.println("After change:" + petsName1.get(tiger));
		
		ageField.setAccessible(true);
		Method method1 = tigerClass.getMethod("run");	
		method1.setAccessible(true);
//		method2.invoke(method1);
	}

}
