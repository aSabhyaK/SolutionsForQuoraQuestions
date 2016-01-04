    import java.util.Scanner;
     
    public class SumCalculationII {
    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
    		int number = -1;
    		long sum = 0;
    		
    		while(scanner.hasNext())
    		{
    			number = scanner.nextInt();
    			
    			if(number < 0)
    				break;
    			
    			sum += number;
    		}	
    		
    		System.out.println(sum);
    		scanner.close();
    	}
    }
