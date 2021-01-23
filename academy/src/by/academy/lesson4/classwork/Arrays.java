package by.academy.lesson4.classwork;
import java.util.Random;


public class Arrays {

	public static void main(String[] args) {

		int[] monthDays = new int[12];
		monthDays[0]=31;
		monthDays[1]=32;
		monthDays[2]=33;
		monthDays[3]=34;
		monthDays[4]=35;
		monthDays[5]=36;
		monthDays[6]=37;
		monthDays[7]=38;
		monthDays[8]=39;
		monthDays[9]=40;
		monthDays[10]=41;
		monthDays[11]=42;
		
		
		int[] monthDays2 = {1, 2, 3, 4, 5, 6, 7};
		
		
		int i=1;
		
		
		int[] array = new int [15];
		Random rand = new Random();
		array[i]=rand.nextInt(10);
		
	}

}
