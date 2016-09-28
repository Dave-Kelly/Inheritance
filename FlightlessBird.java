/**
 * 
 */
package Lab5_9;

/**
 * @author c00193216
 *
 */
public final class FlightlessBird extends Bird {

	/**
	 * @param n
	 * @param w
	 */
	public FlightlessBird(String n, int w) 
	{
		super(n, w);
	}
	
	public String getInfo()
	{
		String myString = "";
		myString = "Name :: " + getName() + "\tWing Span :: " + getWingSpan();
		return myString;
	}

	/* (non-Javadoc)
	 * @see Lab5_9.Bird#fly()
	 */
	public String fly() 
	{
		String myString;
		if(getWingSpan() < 2)
		{
			myString = "Can't Fly";
		}
		else
		{
			myString = "Flap Flap";
		}
		return myString;
	}

}
