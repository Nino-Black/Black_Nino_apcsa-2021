package Unit17Assignmentsstarfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private Image image;
	private boolean alive = true;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		this(x, y, 0);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x, y);
		speed = s;
		try
		{
			//URL url = getClass().getResource("/images/pu.jpg");
			//image = ImageIO.read(url);
			image = ImageIO.read(new File("/Users/nino/Downloads/yellowsquare.jpg"));
		}
		catch(Exception e)
		{
		}
	}
	
	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.yellow);
		window.drawImage(image, getX(), getY(), 25, 25, null);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		if(direction.equals("SPACE"))
		{
			while(getY() < 10) {
				super.setY(super.getY() - speed);
			}
		}
		
	}
	
	public boolean collide(Alien n) {
		if (getX() + 10 >= n.getX() && getX() <= n.getX() + n.getWidth() && getY() - 10 >= n.getY() && getY() <= n.getY() + n.getHeight()) {
			dead();
			return true;
		} 
		else {
			return false;
		}
	}

	public boolean alive() {
		if (getY() < 0) {
			dead();
		}
		return alive;
	}

	public void dead() {
		alive = false;
	}

	public String toString()
	{
		return "";
	}
}
