/**
 * 
 */
package Lab5_9;

/**
 * @author c00193216
 *
 */
public abstract class Reptile extends Animal {

	/**@param n*/
	
	protected String color;
	
	public Reptile(String n, String c) 
	{
		super(n);
		setColor(c);
	}
	public void setColor(String c)
	{
		color = c;
	}
	public String getColor()
	{
		return color;
	}
	public String getInfo()
	{
		String myString = "";
		myString = "Name :: " + getName() + "\tColor :: " + getColor();
		return myString;
	}

	abstract String swim();
	
}
