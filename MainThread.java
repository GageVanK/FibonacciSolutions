public class MainThread {

	public static void main(String[] args) {
		//Instantiates thread1/thread2 & calls run() to compare times 
		
		Thread1 rThread = new Thread1();
		thread1.run();
		Thread2 iThread = new Thread2();
		thread2.run();
		

	}

}
