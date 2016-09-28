/**
 * 
 */
package Lab5_9;

/**
 * @author c00193216
 *
 */
public abstract class Animal {

	//name of animal
	protected String n;
	
	//calls setName method
	public Animal(String n)
	{
		setName(n);
	}
	//assigns String to name (n)
	public void setName(String n)
	{
		this.n = n;
	}
	public String getName()
	{
		return n;
	}
	abstract String getInfo();
	
}
