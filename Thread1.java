public class Thread1 extends Thread{	
	
	
	//Recursive Fibonacci Solution
	public static int fib(int n)
	{
		
		if (n <= 1) 
			return n;
		 
		 return fib(n-1) + fib(n-2);
	
	
	}
	
	public  void run()
	{
		//Calculates the time it takes to run in nanoseconds
		long startTime = (long) System.nanoTime();
		long recursiveSolution = fib(9);
		long endTime = (long) System.nanoTime();
		long time = endTime - startTime;
	
		System.out.println("Recursive Solution: " + recursiveSolution + " in " + time + "ns");
		
	}
	
	
}
