public class PerfectSquareCheck {
	public static void main(String[] args) {
		
		long square = -1L, palindrome = -1L;
		
		for(int i = 99; i > 31; -- i)
		{
			square = i * i;
 
			palindrome = Long.parseLong(new StringBuilder(Long.toString(square)).reverse().toString());
			
			if(isSquare(palindrome) && square % palindrome == 0)
				System.out.println(square);
		}
	}
	
	private static boolean isSquare(long number)
	{
		long root = (long) Math.sqrt(number);
	        return number == root * root;
	}
}
