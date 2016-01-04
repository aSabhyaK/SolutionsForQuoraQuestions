    import java.io.Serializable;
     
    public class Soup implements Serializable{
    	
    	private static final long serialVersionUID = 12231L;
    	private String vegetable;
    	private float temperature;
    	private boolean eatable;
    	private transient String method;
    	
    	public Soup(String v, float t, boolean e, String m)
    	{
    		this.vegetable = v;
    		this.temperature = t;
    		this.eatable = e;
    		this.method = m;
    	}
    	
    	public String toString()
    	{
    		return this.vegetable + ": " 
    				+ this.temperature + ": " 
    				+ this.eatable + ": "
    				+ this.method;
    	}
    }
