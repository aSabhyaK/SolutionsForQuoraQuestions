    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.ObjectOutputStream;
     
    public class SerializeMe {
     
    	public static void main(String[] args) {
    		//frozen soup
    		Soup frozenSoup = new Soup("tomato", 99.4f, true, "simmer");
     
    		try(FileOutputStream soupFile = new FileOutputStream("./soup.data");
    				ObjectOutputStream outStream = new ObjectOutputStream(soupFile)) 
    		{
    			//liquefication and transfer of the soup
    			outStream.writeObject(frozenSoup);
    			System.out.printf("Serialized data is saved in ./soup.data file");
    		} 
     
    		catch (IOException ioe) 
    		{
    			ioe.printStackTrace();
    			System.err.println(ioe.getLocalizedMessage());
    		}
    	}
    }
