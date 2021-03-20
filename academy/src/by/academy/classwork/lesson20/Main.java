package by.academy.classwork.lesson20;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		// implements Runnable
		Thread1 threadR = new Thread1();
		Thread newthread = new Thread(threadR);

		// extend Thread
		Thread2 threadT = new Thread2();
		System.out.println(newthread.getPriority() + " " + newthread.getName() + " " + newthread.getState());

		newthread.start();
		
		threadT.start();
		System.out.println(threadT.getPriority() + " " + threadT.getName() + " " + threadT.getState());

		System.out.println("Finish main");
		
		
	}

}
