package Unit13Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		for (int i = 0; i < number; count++) {
			number /= 10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[NumberSorter.getNumDigits(number)];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = number%10;
			if (number > 0) {
				number /= 10;
			}
		}
		Arrays.sort(sorted);
		return sorted;
	}
}