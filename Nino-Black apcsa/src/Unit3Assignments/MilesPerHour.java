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

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	private int num;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
		num=0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		
	}

	public void calcMPH(int dist, int hrs, int mins)
	{
		mph = Math.round((distance)/(hours + (minutes/60.0)));
		num = (int) mph;
	}

	public void print()
	{
		out.println(distance + " miles in " + hours + " hour and " + minutes + " minutes = " + num + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}