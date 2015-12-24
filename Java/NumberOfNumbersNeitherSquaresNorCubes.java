public class NumberOfNumbersNeitherSquaresNorCubes {

	static boolean[] array;
	static int size = 1000000, totalSquaresOrCubes = -1;
	static int lower_limit = 1;
	
	static
	{
		array = new boolean[size + 1];
		
		for(int i = lower_limit; i <= Math.sqrt(size); ++ i)
			array[i * i] = true;
		
		int cube = -1;
		for(int i = lower_limit; i <= Math.cbrt(size); ++ i)
		{
			cube = i * i * i;
			
			//to avoid re-marking the cubes which have already been marked as 
			//squares
			if(!array[cube])
				array[cube] = true;
		}
		
		for(int i = 0; i < size + 1; ++ i)
			if(array[i])
				totalSquaresOrCubes ++;
	}
	
	public static void main(String[] args) {
		System.out.println(size - lower_limit - totalSquaresOrCubes);
	}
}
