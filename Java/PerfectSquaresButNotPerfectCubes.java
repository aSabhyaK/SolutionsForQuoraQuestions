public class PerfectSquaresButNotPerfectCubes {

	private static int maximum = 1000000;
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i <= Math.sqrt(maximum); ++ i)
			if(!isPerfectCube(i * i))
				count ++;
		
		System.out.println(count);
	}
	
	private static boolean isPerfectCube(long number)
	{
		long cube_root = (long)Math.cbrt(number);
		return cube_root * cube_root * cube_root == number;
	}
}
