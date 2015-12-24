public class LargestNDigitSquare {

	public static void main(String[] args) {
		long root = (long)Math.sqrt(formTheNumber(5));
		System.out.println(root * root);
	}
	private static long formTheNumber(int n)
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i = 0; i < n; ++ i)
			stringBuilder.append(9);
		
		return Long.parseLong(stringBuilder.toString());
	}
}
