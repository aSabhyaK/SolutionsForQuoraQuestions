public class FactorialBigIntegerArrayApproach {

	private static final int MAX = 1000;
	private static int[] mag;
	
	static
	{
		mag = new int[MAX];
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(100));
	}
	
	private static String factorial(int n)
	{
	    mag[0] = 1;
	    
	    int max_index = 1;
	    StringBuilder stringBuilder = new StringBuilder();
	    
	    for (int i = 2; i <= n; ++ i)
	    	max_index = multiply(i, max_index);
	    
	    for (int i = max_index - 1; i >= 0; -- i)
	        stringBuilder.append(mag[i]);
	    
	    return stringBuilder.toString();
	}
	
	private static int multiply(int x, int size)
	{
		int carry = 0, product = -1;
		
		for (int i = 0; i < size; ++ i)
	    {
	        product = mag[i] * x + carry;
	        mag[i] = product % 10;  
	        carry  = product / 10;    
	    }

	    while (carry != 0)
	    {
	    	mag[size] = carry%10;
	        carry = carry/10;
	        size++;
	    }
	    
	    return size;
	}
}
