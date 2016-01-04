    import java.io.*;
     
    public class DeserializeMe {
    	public static void main(String[] args) {
    		Soup refrostedSoup = null;
     
    		try(FileInputStream soupFile = new FileInputStream("./soup.data");
    				ObjectInputStream inStream = new ObjectInputStream(soupFile)) 
    		{
    			//refreezing the soup
    			refrostedSoup = (Soup)inStream.readObject();
    		} 
    		
    		//encaps both the ClassNotFoundException and IOException
    		catch(Exception exception) 
    		{
    			System.err.println(exception.getLocalizedMessage());
    		}
    		
    		System.out.println("Deserializing Soup...");
    		System.out.println(refrostedSoup.toString());
    	}
    }
