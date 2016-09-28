/**
 * 
 */
package Lab5_9;

/**
 * @author c00193216
 *
 */
public class AnimalDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Animal[] theArray;
		LandReptile snake;
		WaterReptile turtle;
		Mamal horse;
		FlyingBird eagle;
		FlightlessBird chicken;
		
		snake =  new LandReptile("Snake", "yello");
		turtle = new WaterReptile("Turtle", "green");
		horse = new Mamal("Horse", 4);
		eagle = new FlyingBird("Eagle", 15);
		chicken = new FlightlessBird("Chicken", 1);
		
		theArray = new Animal[5];
		theArray[0] = snake;
		theArray[1] = turtle;
		theArray[2] = horse;
		theArray[3] = eagle;
		theArray[4] = chicken;
		
		for(int i = 0; i < theArray.length; i++)
		{
			System.out.println(theArray[i].getInfo());
		}
		
		System.out.println(snake.getName()+ " - swim :: " + snake.swim());
		System.out.println(turtle.getName()+ " - swim :: " + turtle.swim());
		
		System.out.println(eagle.getName()+ " - fly :: " + eagle.fly());
		System.out.println(chicken.getName()+ " - fly :: " + chicken.fly());
	}

}
