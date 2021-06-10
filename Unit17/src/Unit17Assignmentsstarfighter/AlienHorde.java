package Unit17Assignmentsstarfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a : aliens) {
	            a.draw(window);
	    }
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++) {
			if(aliens.get(i).getY() <= 50) {
				for(int j = 0; j < 20; j++) {
					for(int k = 0; k < aliens.size(); k++) {
						aliens.get(k).move("Down");
					}
				}
				
			}
			if(aliens.get(i).getY() >= 700){
				for(int j = 0; j < 20; j++){
					for(int k = 0; k < aliens.size(); k++){
						aliens.get(k).move("Up");
					}
				}
			}
			if(aliens.get(i).getX() <= 50) {
				for(int b = 0; b < 20; b++) {
					for(int k = 0; k < aliens.size(); k++) {
						aliens.get(k).move("Right");
					}
				}
				
			}
			if(aliens.get(i).getY() >= 700) {
				for(int j = 0; j < 20; j++) {
					for(int k = 0; k < aliens.size(); k++) {
						aliens.get(k).move("Left");
					}
				}
				
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		ArrayList<Ammo> hit = new ArrayList<Ammo>();
		for(int i = 0; i < shots.size(); i++) {
			for(int j = 0; j < aliens.size(); j++) {
				if((shots.get(i).getX() >= aliens.get(j).getX() && shots.get(i).getX() <= aliens.get(j).getX() + aliens.get(j).getWidth()) || (shots.get(i).getX() + 10 >= aliens.get(j).getX() && shots.get(i).getX() + 10 <= aliens.get(j).getX() + aliens.get(j).getWidth())) {
					if(shots.get(i).getY( )>= aliens.get(j).getY() && shots.get(i).getY() <= aliens.get(j).getY()  +aliens.get(j).getHeight()) {
						aliens.remove(j);
						j--;
					}
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
