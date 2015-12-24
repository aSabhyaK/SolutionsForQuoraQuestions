public class DivisibilityBy29 {

	public static void main(String[] args) {
		for(int i = 9999; i >= 1000; -- i)
			if(i % 29 == 0 && isTheDigitSum29(Integer.toString(i).toCharArray()))
				System.out.println(i);
	}
	
	private static boolean isTheDigitSum29(char[] array)
	{
		long sum = 0L;
		
		for(char c: array)
		{
			sum += c - 48;
			
			if(sum > 29)
				return false;
		}
		
		return sum == 29;
	}
}
