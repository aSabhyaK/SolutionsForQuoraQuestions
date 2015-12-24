public class PerfectSquareAndPerfectCube {

	private static int upper_limit = 1_000_000;
	
	public static void main(String[] args) {
		
		PerfectSquareAndPerfectCube psapc = new PerfectSquareAndPerfectCube();
		int count = 0;
		
		for(int i = 1; i <= Math.cbrt(upper_limit); ++ i)
			if(psapc.isPerfectSquare(i * i * i))
				count ++;
			
		System.out.println(count);
	}
	
	private boolean isPerfectSquare(long number)
	{
		long square_root = (long)Math.sqrt(number);
		return square_root * square_root == number;
	}
}
