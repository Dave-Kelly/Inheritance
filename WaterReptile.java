/**
 * 
 */
package Lab5_9;

/**
 * @author c00193216
 *
 */
public final class WaterReptile extends Reptile {

	/**
	 * @param n
	 * @param c
	 */
	public WaterReptile(String n, String c) 
	{
		super(n, c);
	}

	/* (non-Javadoc)
	 * @see Lab5_9.Reptile#swim()
	 */
	public String swim() 
	{
		String myString = "Swim";
		return myString;
	}

	/* (non-Javadoc)
	 * @see Lab5_9.Animal#getInfo()
	 */
	public String getInfo() 
	{
		String myString = "";
		myString = "Name :: " + getName() + "\tColor :: " + getColor();
		return myString;
	}

}
