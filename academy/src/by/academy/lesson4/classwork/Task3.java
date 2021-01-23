package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//3. Составьте программу, составьте программу, 
//которая вычисляет произведение чисел от 1 до n.n вводится с клавиатуры.

		System.out.println ("Введите число: ");
		
		Scanner num=new Scanner(System.in);
		int a;
		int result=1;
		a = num.nextInt();
		
		for (int i=1; i!=a+1; i++){
			result*=i;
			}
				
		System.out.println("Произведение чисел от 1 до "+a +" равно " + result);
		num.close();
	}
	
	
}
