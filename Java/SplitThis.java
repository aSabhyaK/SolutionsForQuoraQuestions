import java.util.Arrays;
 
public class SplitThis {
	public static void main(String[] args) {
		String string = "\"hello\", \"palantir, quora, marc\", \"quora\"";
		System.out.println(
                  Arrays.asList(
		                string.substring(1, string.length() - 1).
		                //had to, nothing struck the mind as to how to manage the quotes on the extremeties.
		                //so, created a new string using the substring method which ignores 'em.
		                  split(
			                    "[\"]*"		
                          //a measly double quote may or may not exist ahead of the comma.
			                    + ","	    
                          //the all-important comma, the pivot of all separation, I kneel before thee.
		                      + "\\s*"    
                          //comma might (or might not) be followed by a somewhat important whitespace.
		                      + "[\"]*"   
                          //and that might (or might not) be followed by another escaped double quote.
			                )
		              )
	 );
  }  
}
