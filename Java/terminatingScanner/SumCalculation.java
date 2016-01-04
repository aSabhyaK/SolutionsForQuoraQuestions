    import java.util.Scanner;
     
    public class SumCalculation {
    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
    		int cases = scanner.nextInt(), numberOfNumbers = -1;
    		long sum = 0L;
    		
    		while(cases -- > 0)
    		{
    			numberOfNumbers = scanner.nextInt();
    			
    			while(numberOfNumbers -- > 0)
    				sum += scanner.nextInt();
    			
    			System.out.println(sum);
    			sum = 0L;
    		}
    		
    		scanner.close();
    	}
    }
