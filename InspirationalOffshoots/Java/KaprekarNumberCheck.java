import java.util.ArrayList;
import java.util.Collections;

public class KaprekarNumberCheck {

	private static int iterations = 0;
	private static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 999; ++ i)
		{
			System.out.print(i + ": ");
			
			if(isKaprekar(i))
				System.out.print(": " + iterations + "\n");
			
			else
				System.out.print(": NOT KAPREKAR\n");
			
			iterations = 0;
		}	
	}
	
	private static boolean isKaprekar(long number)
	{		
		System.out.print(number + " ");
		
		if(number == 0 | isRepdigit(number))
			return false;
		
		if(number == 6174)
			return true;
		
		iterations ++;
		return isKaprekar(formNumber(number, 'l') - formNumber(number, 's'));
	}
	
	private static long formNumber(long number, char marker)
	{
		char[] array = Long.toString(number).toCharArray();
		int length = array.length;
		
		if(length < 4)
			for(int i = 0; i < 4 - length; ++ i)
				list.add(0);
		
		for(char c: array)
			list.add(c - 48);
		
		Collections.sort(list);
		
		if(marker == 'l')
			Collections.reverse(list);
		
		long sum = 0;
		
		for(int i = 0; i < 4; ++ i)
			sum += list.get(i) * Math.pow(10, 3 - i);
		
		list.clear();
		return sum;
	}
	
	private static boolean isRepdigit(long number)
	{
		char[] array = Long.toString(number).toCharArray();
		int count = 0, length = array.length;
		char first = array[0];
		
		for(int i = 1; i < length; ++ i)
			if(array[i] != first)
				return false;
		
			else
				count ++;
			
			if(count == 3)
				return true;
		
		return count == 3;
	}
}
