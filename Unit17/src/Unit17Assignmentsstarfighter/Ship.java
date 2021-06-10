package Unit17Assignmentsstarfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
		this(x, y, 50, 50, 5);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		this(x, y, 50, 50, s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			//URL url = getClass().getResource("/images/ship.jpg");
			//image = ImageIO.read(url);
			image = ImageIO.read(new File("/Users/nino/Downloads/Unit17Students/Unit17_Assignments-starfighter/ship.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Couldn't read file.");
			//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		//add code here
		 if (direction.equals("Up")) {
	            super.setY(super.getY() + speed);
	     }
	     if (direction.equals("Down")) {
	            super.setY(super.getY() - speed);
	     }
	     if (direction.equals("Right")) {
	            super.setX(getX() + speed);
	     }
	     if (direction.equals("Left")) {
	            super.setX(getX() - speed);
	     }
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
