package Series;

public class fibonacci_series{
	
	public void fibo(int n)
	{
		int first = 0;
		int second = 1;
		System.out.println("Output for Fibonacci Series");
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(int i = 0;i<n;i++)
		{
			int third = first + second;
			System.out.print(third+" ");
			first = second;
			second = third;
		}
	}
}