package Lab5_9;

public final class Mamal extends Animal 
{
	//Number of legs
	private int legs;
	
	public Mamal(String n, int l) 
	{
		super(n);
		setLegs(l);
	}
	public void setLegs(int l)
	{
		legs = l;
	}
	public int getLegs()
	{
		return legs;
	}
	String getInfo() 
	{
		String myString = "";
		myString = "Name :: " + getName() + "\tNumber of legs :: " + getLegs();
		return myString;
	}

}
