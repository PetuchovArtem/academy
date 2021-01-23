package by.academy.lesson4.classwork;

import java.util.Random;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] array=new int[6];
		int i=0;
		
		for (i=0; i<=5; i++){
			Random rand = new Random();
			array[i]=rand.nextInt(10);
					
		}
	       System.out.println(Arrays.toString(array));
	       for (i=0; i < array.length; i++) {
	       
		for (int n = 0; n < array.length; n++) {
			if (array[i] < array[n]) {
				int temp;
				temp = array[n];
				array[n] = array[i];
				array[i] = temp;
			 }
		}
	       }
		
	       System.out.println(Arrays.toString(array));
		

			}

}
