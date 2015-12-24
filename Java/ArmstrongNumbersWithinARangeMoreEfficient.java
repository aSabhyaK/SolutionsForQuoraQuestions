public class ArmstrongNumbersWithinARangeMoreEfficient {
	static int rows = 8, columns = 20;
	static long[][] powers = new long[rows][columns];
	
	static
	{
		for(int i = 0; i < rows; ++ i)
			for(int j = 0; j < columns; ++ j)
				powers[i][j] = (long)(Math.pow(i + 2, j + 1));
	}
	
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		int range_lower_limit = 1, range_upper_limit = 99999999;
		
		for(int i = range_lower_limit; i < range_upper_limit; ++ i)
			if(isArmstrong(i))
				System.out.println(i);
		
		long nanotime = System.nanoTime() - start;
		System.out.println("TT: " + (nanotime / 1000000000) + " seconds.");
	}
	
	private static boolean isArmstrong(long number)
	{
		char[] array = Long.toString(number).toCharArray();
		int length = array.length, intermed = -1;
		long sum = 0L;
		
		for(char c: array)
		{
			intermed = c - 48;
			
			if(intermed < 2)
				sum += intermed;
			
			else
				sum += powers[intermed - 2][length - 1];
			
			if(sum > number)
				return false;
		} 
		
		return sum == number;
	}
}
