/**
 * 
 */
package Lab5_9;

/**
 * @author c00193216
 *
 */
public abstract class Bird extends Animal {

	/**
	 * @param n
	 */
	//Birds wingspan
	private int wingSpan;
	
	public Bird(String n, int w) 
	{
		super(n);
		setWingSpan(w);
	}

	private void setWingSpan(int w) 
	{
		wingSpan = w;
	}
	public int getWingSpan()
	{
		return wingSpan;
	}
	/* (non-Javadoc)
	 * @see Lab5_9.Animal#getInfo()
	 */
	String getInfo() 
	{
		return null;
	}
	abstract String fly();
}
