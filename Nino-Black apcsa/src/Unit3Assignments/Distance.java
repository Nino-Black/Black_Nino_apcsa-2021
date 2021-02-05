package Unit3Assignments;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	private double num;

	public Distance()
	{
		setCoordinates(0, 0, 0 ,0);
		distance = 0;
		num = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance(int x1, int y1, int x2, int y2)
	{
		double xnum = (x2 - x1);
		double ynum = (y2 - y1);
		xnum = Math.pow(xnum, 2);
		ynum = Math.pow(ynum, 2);
		num = xnum + ynum;
		num = Math.sqrt(num);
	}
	
	public void getDistance()
	{
		Scanner keyboard = new Scanner(System.in); {
		System.out.println("Enter X1 :: ");
		xOne= keyboard.nextInt();
		System.out.println("Enter Y1 :: ");
		yOne= keyboard.nextInt();
		System.out.println("Enter X2 :: ");
		xTwo= keyboard.nextInt();
		System.out.println("Enter Y2 :: ");
		yTwo= keyboard.nextInt();
		
	 }
	}	
	public void print()
	{
		out.printf("distance == " + num);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}