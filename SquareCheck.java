class SquareCheck {
 
	static ArrayList perfectSquares;
 	static
 	{
  		perfectSquares = new ArrayList<>();
 
  		perfectSquares.add('0');
  		perfectSquares.add('1');
  		perfectSquares.add('4');
  		perfectSquares.add('9');
 	}
 
 	public static void main(String[] args) 
 	{
		long square = 0L;
  
  		for(int i = 99; i > 31; -- i)
  		{
   			square = i * i;
   			if(areThemDigitsAlsoSquares(Long.toString(square).toCharArray()))
   			{
    			    System.out.println(square);
    			    break;
   			}
  		}
 	}
 
 	private static boolean areThemDigitsAlsoSquares(char[] array) 
 	{
		for(char c: array)
   			if(!perfectSquares.contains(c))
    			    return false;
 
  		return true;
 	}
}
