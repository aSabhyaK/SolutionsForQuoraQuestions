public class StaticCheck {
    static int x = 10;
    
    public static void main(String[] args)
    {
        StaticCheck t = new StaticCheck();
        t = null;
          
        System.out.println(t.x);
        System.out.println(StaticCheck.x);
    }
}
