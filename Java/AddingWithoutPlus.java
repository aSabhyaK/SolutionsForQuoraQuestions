public class AddingWithoutPlus {

	public static void main(String[] args) {
		AddingWithoutPlus awp = new AddingWithoutPlus();
		
		System.out.println(awp.addUsingIntegerSum(3, 4));
		System.out.println(awp.addUsingBigIntegerSum(3, 4));
		System.out.println(awp.addUsingBitLevelManipulationIteratively(3, 4));
		System.out.println(awp.addUsingBitLevelManipulationRecursively(3, 4));
	}
	
	private int addUsingIntegerSum(int p, int q)
	{
		return Integer.sum(p, q);
	}
	
	private int addUsingBigIntegerSum(int p, int q)
	{
		return BigInteger.valueOf(p).add(BigInteger.valueOf(q)).intValue();
	}
	
	private int addUsingBitLevelManipulationIteratively(int p, int q)
	{
		int carry = -1;
		
		while (q != 0)
		{
            		carry = (p & q) ;
            		p ^= q;
            		q = carry << 1;
		}
		
        	return p;
	}
	
	private int addUsingBitLevelManipulationRecursively(int p, int q)
	{
		if (q == 0) 
			return p;
	    
		return addUsingBitLevelManipulationRecursively(
				(p ^ q), 
				(p & q) << 1);
	}
}
