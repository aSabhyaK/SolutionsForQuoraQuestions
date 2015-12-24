    public class DivideByZero {
     
        public static void main(String[] args) {
            DivideByZero dbz = new DivideByZero();
            //'dbz': Get it? I am a big fan!
            
            //case 1: division by Zero
            System.out.println(dbz.canIDivideByZero_1(3, 0));
            System.out.println(dbz.canIDivideByZero_2(3, 0));
            
            try{
                System.out.println(dbz.canIDivideByZero_3(3, 0));
            }
            
            catch(ArithmeticException ae)
            {
                System.err.println("\n" + ae.getMessage());
            }
            
            //case 2: divide by a non-Zero Integer
            System.out.println(dbz.canIDivideByZero_1(3, 2));
            System.out.println(dbz.canIDivideByZero_2(3, 2));
            System.out.println(dbz.canIDivideByZero_3(3, 2));
        }
        
        private double canIDivideByZero_1(int first_number, int second_number)
        {
            Double result = 0.0;
            
            if(second_number == 0)
                result = Double.NaN;
            
            else
                result = first_number / (double)second_number;
            
            return result;
        }
        
        private double canIDivideByZero_2(int first_number, int second_number)
        {
            Double result = 0.0;
        
            try
            {
                result = first_number / (double)second_number;
            }
            
            catch(ArithmeticException e)
            {
                result = Double.NaN;
                //you could very easily have thrown an Exception from here, 
                //but I chose to send Infinity back.
                
                //use exception in case you'd like to make your code
                //more readable and expressive. Because you might not want
                //to return Infinity every time.
     
                //refer to the output associated with the call to the method canIDivideByZero_3
            }
            
            return result;
        }
        
        private double canIDivideByZero_3(int first_number, int second_number)
        {
            Double result = 0.0;
            
            if(second_number == 0)
                throw new ArithmeticException("Why you dividin' by 0? You crazy?");
            
            else
                result = first_number / (double)second_number;
            
            return result;
        }
    }
    
    /*
    OUTPUT:
    NaN
    Infinity
     
    Why you dividin' by 0? You crazy?
    1.5
    1.5
    1.5
    */
