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

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int distance = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hours = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int minutes = keyboard.nextInt();
		
		MilesPerHour test = new MilesPerHour(distance, hours, minutes);
		test.setNums(distance, hours, minutes);
		test.calcMPH(minutes, minutes, minutes);
		test.print();
		
		//add more test cases
		
		
	}
}