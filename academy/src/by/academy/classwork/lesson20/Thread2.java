package by.academy.classwork.lesson20;

public class Thread2 extends Thread {

	public void run() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i=0;i<10;i++) {
			System.out.println("Thread2 i= " + i);
			System.out.println(Thread.currentThread().getState());
		}
	}

}
