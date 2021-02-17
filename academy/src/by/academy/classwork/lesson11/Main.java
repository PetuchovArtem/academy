package by.academy.classwork.lesson11;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
//		Task6 task = new Task6("1", null , null);
//		System.out.println(task.getT());
		
		Double[] array1= {1.2, 1.3};
		MinMax<Double> array = new MinMax<>(array1);

		System.out.println(Arrays.toString(array.getArray()));
	}
	


}
