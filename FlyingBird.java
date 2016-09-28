/**
 * 
 */
package Lab5_9;

/**
 * @author c00193216
 *
 */
public final class FlyingBird extends Bird {

	/**
	 * @param n
	 * @param w
	 */
	public FlyingBird(String n, int w)
	{
		super(n, w);
	}

	/* (non-Javadoc)
	 * @see Lab5_9.Bird#fly()
	 */
	public String getInfo()
	{
		String myString = "";
		myString = "Name :: " + getName() + "\tWing Span :: " + getWingSpan();
		return myString;
	}

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
