public class NThPrime {

	private static boolean[] array = null;
	private static ArrayList<Integer> list = new ArrayList<>();
	
	static
	{
		//pre-computing the values for the 
                //first 10^7 primes using the Sieve of Eratosthenes
		
                int n = 10000000;
		array = new boolean[n + 1];
		
		array[0] = array[1] = true;
		
		for(int i = 2; i <= Math.sqrt(n); ++ i)
		{
			if(!array[i])
			{
				for(int j = i; i * j <= n; ++ j)
					array[i * j] = true;
			}
		}
		
		for(int i = 0; i < n + 1; ++ i)
			if(!array[i])
				list.add(i);
	}
	
  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		
		while(cases -- > 0)
	            System.out.println(list.get(scanner.nextInt() - 1));
		
		scanner.close();
	}
}
