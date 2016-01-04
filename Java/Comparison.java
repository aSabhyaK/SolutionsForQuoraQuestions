    public class Comparison {
    	public static void main(String[] args) {
    		String one = "abc", two = "abc";
    		String three = new String("abc");
    		String four = new String("abc");
    		String five = "abe", six = "abd";
    		
    		System.out.println(checkEquality(one, two) + ", " 
    				+ checkEquals(one, two) + ", " 
    				+ checkCompareTo(one, two));
    		
    		System.out.println(checkEquality(three, four) + ", " 
    				+ checkEquals(three, four) + ", " 
    				+ checkCompareTo(three, four));
    		
    		System.out.println(checkEquality(one, three) + ", " 
    				+ checkEquals(one, three) + ", " 
    				+ checkCompareTo(one, three));
    		
    		System.out.println(five.compareTo(four));
    		System.out.println(four.compareTo(six));
    	}
    	
    	private static boolean checkEquality(String string_1, String string_2)
    	{
    		return string_1 == string_2;
    	}
    	
    	private static boolean checkEquals(String string_1, String string_2)
    	{
    		return string_1.equals(string_2);
    	}
    	
    	private static int checkCompareTo(String string_1, String string_2)
    	{
    		return string_1.compareTo(string_2);
    	}
    }
