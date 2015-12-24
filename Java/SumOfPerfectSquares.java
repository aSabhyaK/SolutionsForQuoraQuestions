public class SumOfPerfectSquares {

	public static void main(String[] args) {
		int lower_limit = (int)Math.sqrt(smallestSquareGreaterThanOrEqualTo(120));
		int upper_limit = (int)Math.sqrt(largestSquareLesserThanOrEqualTo(300));
		
		long sum = 0;
		
		for(int i = lower_limit; i <= upper_limit; ++ i)
			sum += i * i;
		
		System.out.println(sum);
	}
	private static double largestSquareLesserThanOrEqualTo(int number) 
	{
		for(int i = number; ; -- i)
			if(isPerfectSquare(i))
				return i;
	}
	private static double smallestSquareGreaterThanOrEqualTo(int number) 
	{
		for(int i = number; ; ++ i)
			if(isPerfectSquare(i))
				return i;
	}
	
	private static boolean isPerfectSquare(long number)
	{
		long root = (long)Math.sqrt(number);
		return root * root == number;
	}
}
