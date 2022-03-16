public class Thread2 extends Thread {
	
	//Iterative Fibonacci Solution
	public static int fib(int n)
	{
		int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
	}
	
	public void run()
	{
		//Calls fib() & Calculates the time it takes to run in Milliseconds
		long startTime = (long) System.nanoTime();
		long iterativeSolution = fib(9);
		long endTime = (long) System.nanoTime();
		long time = endTime - startTime;
	
		System.out.println("Iterative Solution: " + iterativeSolution + " in " + time + "ns");
		
	}
	
	
}
