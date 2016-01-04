    import java.util.HashMap;
    import java.util.Map;
     
    public class AnagramCheck {
    	public static void main(String[] args) {
    		String three = "dorm";
    		String four = "mordor";
    		//LOTR refernce
    		System.out.println(areAnagramsHashMap(three, four));
    		System.out.println(areAnagramsArray(three, four));
    		
    		String five = "tom marvolo riddle";
    		String six = "iam lord voldemort";
    		//the famous Harry Potter reference
    		System.out.println(areAnagramsHashMap(five, six));
    		System.out.println(areAnagramsArray(five, six));
    	}
    	
    	private static boolean areAnagramsArray(String one, String two)
        {
    	    int[] array = new int[256];
    		
    	    for(char c: one.toCharArray())
    	    	array[c] ++;
    		
            for(char c: two.toCharArray())
        		array[c] --;
    		
            for(int i = 0; i < 256; ++ i)
        		if(array[i] != 0)
        			return false;
    		
    	    return true;
        }
    	
    	private static boolean areAnagramsHashMap(String one, String two)
    	{
    		Map<Character, Integer> map = new HashMap<>();
    		
    		for(char c: one.toCharArray())
    			if(map.containsKey(c))
    				map.put(c, map.get(c) + 1);
    		
    			else
    				map.put(c, 1);
    		
    		for(char c: two.toCharArray())
    			if(!map.containsKey(c))
    				return false;
    		
    			else
    			{
    				map.put(c, map.get(c) - 1);
    			
    				if(map.get(c) == 0)
    					map.remove(c);
    			}
    		
    		return map.isEmpty();
    	}
    }
