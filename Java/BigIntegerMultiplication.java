    import java.math.BigInteger;
     
    public class BigIntegerMultiplication {
    	public static void main(String[] args) {
    		String one = 
    				"9332621544394415268169923885"
    			  + "6266700490715968264381621468"
    			  + "5929638952175999932299156089"
    			  + "4146397615651828625369792082"
    			  + "7223758251185210916864000000"
    			  + "000000000000000000";
    		
    		String two = "5166566839092074458466334866"
    				+ "571597694114460570387986357538"
    				+ "048450432901440804868689337999"
    				+ "823161841839689242893622491638"
    				+ "917313351308387294478994745350"
    				+ "551549126803";
    		
    		BigInteger bigInteger_1 = new BigInteger(one);
    		BigInteger bigInteger_2 = new BigInteger(two);
    		BigInteger product = bigInteger_1.multiply(bigInteger_2);
    		
    		System.out.println(one.length() + ", " + two.length());
    		System.out.println(product);
    		System.out.println(product.toString().length());
    	}
    }
