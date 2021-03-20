package by.academy.classwork.lesson20;

public class Thread1 implements Runnable {

	public Thread1(){
		super();
	}
	
	@Override
	public void run() {
		
		for (int i=0;i<10;i++) {
			System.out.println("Thread1 i= "+i);
			System.out.println(Thread.currentThread().getState());
		}
		
	}
	

}
