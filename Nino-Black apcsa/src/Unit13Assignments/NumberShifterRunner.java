package Unit13Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		for(int i = 0; i < 3; i++ ) {
			int[] ray = NumberShifter.makeLucky7Array(10);
			System.out.println(Arrays.toString(ray));
			NumberShifter.shiftEm(ray);
			System.out.println(Arrays.toString(ray));
		}
	}
}



