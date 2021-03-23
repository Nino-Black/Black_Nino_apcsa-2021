package Unit12Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int howBig;
	//add a constructor

	public Skeleton() {
		name = "no name";
		howBig = 0;
	}
	
	public Skeleton(String n, int size) {
		name = n;
		howBig = size;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHowBig() {
		return howBig;
	}
	//add code to implement the Monster interface
	public boolean isBigger(Monster other) {
		return howBig > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other) {
		return howBig < other.getHowBig();
	}
	
	public boolean namesTheSame(Monster other) {
		if (name.equals(other.getName())) {
			return true;
		}
		return false;	
	}
	//add a toString
	public String toString() {
		return " " + name + " " + howBig;
	}
}