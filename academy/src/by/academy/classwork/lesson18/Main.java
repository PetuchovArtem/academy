package by.academy.classwork.lesson18;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		System.out.println("Cat-----------------------");
		Cat cat = new Cat("Kisa", "ArtiomForCat", 1);
		Class<? extends Cat> catClass = cat.getClass();
		Field serialcatClass = catClass.getDeclaredField("petsName");
//		System.out.println(serialcatClass);
//getDeclaredConstructor
		Field[] declaredFieldsCats = catClass.getDeclaredFields();

		for (Field field : declaredFieldsCats) {
			System.out.println(field);
		}
	
	

		System.out.println("Tiger-----------------------");
		Tiger tiger = new Tiger("Tiger", "ArtiomForTiger", 2);
		Class<? extends Tiger> tigerClass = tiger.getClass();
		Field serialtigerClass = tigerClass.getDeclaredField("petsName1");

		Field[] declaredFieldsTiger = tigerClass.getDeclaredFields();

		for (Field field : declaredFieldsTiger) {
			System.out.println(field);
		}

	}

}
