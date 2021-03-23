package Unit12Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word list[] = new Word[size];
		
		for(int i = 0; i < size; i++)
		{
			Word t = new Word(file.next());
			list[i] = t;
		}
		
		for(int j = 0; j < size; j++)
		{
			for(int k = 0; k < size - 1; k++)
			{
				if(list[k].compareTo(list[k + 1]) > 0)
				{
					Word r=list[k + 1];
					list[k + 1] = list[k];
					list[k]=r;
				}
				else if(list[k].getLength()==list[k + 1].getLength()&&list[k].toString().compareTo(list[k + 1].toString()) > 0)
				{
					Word r = list[k + 1];
					list[k + 1] = list[k];
					list[k] = r;
				}
			}
		}
		
		for(int j = 0; j < size; j++)
		{
			System.out.println(list[j]);
		}
	}
}