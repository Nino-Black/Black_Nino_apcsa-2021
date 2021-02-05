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

public class DistanceRunner
{
	public static void main( String[] args)
	{
		//add test cases	
		Scanner keyboard = new Scanner(System.in); {
			System.out.println("Enter X1 :: ");
			int xOne= keyboard.nextInt();
			System.out.println("Enter Y1 :: ");
			int yOne= keyboard.nextInt();
			System.out.println("Enter X2 :: ");
			int xTwo= keyboard.nextInt();
			System.out.println("Enter Y2 :: ");
			int yTwo= keyboard.nextInt();
			
		Distance test = new Distance(xOne, yOne, xTwo, yTwo);
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		test.calcDistance(xOne, yOne, xTwo, yTwo);
		test.print();
		}
	}
}