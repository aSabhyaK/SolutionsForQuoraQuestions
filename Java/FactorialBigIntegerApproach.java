import java.math.BigInteger;

public class FactorialBigIntegerApproach {

	public static void main(String[] args) {
		BigInteger large_factorial = factorial(BigInteger.valueOf(100L));
		System.out.println(large_factorial);
	}

	private static BigInteger factorial(BigInteger number)
	{
		if(number.equals(BigInteger.ONE))
			return BigInteger.ONE;
		
		return number.multiply(factorial(number.subtract(BigInteger.ONE)));
	}
}
