    import java.util.HashMap;
    import java.util.Map;
     
    public class AnagramCheckUsingHashMap {
    	public static void main(String[] args) {
    		String three = "dorm";
    		String four = "mordor";
    		//LOTR refernce
    		System.out.println(areAnagrams(three, four));
    		
    		String five = "tom marvolo riddle";
    		String six = "iam lord voldemort";
    		//the famous Harry Potter reference
    		System.out.println(areAnagrams(five, six));
    	}
    	
    	private static boolean areAnagrams(String one, String two)
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
