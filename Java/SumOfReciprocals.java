public class SumOfReciprocals {

	public static void main(String[] args) {
		double sum = 0.0;
		
		for(int i = 1; i < 101; ++ i)
			sum += 1 / (double)i;
		
		System.out.println(sum);
	}
}
