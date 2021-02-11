package Unit5Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
	}

	public WordsCompare(String one, String two)
	{
		setWords(wordOne, wordTwo);
	}

	public void setWords(String one, String two)
	{
         wordOne = one;
         wordTwo = two;
	}

	public void compare(String one, String two)
	{
         compare = wordOne.compareTo(wordTwo);
	}	

	public String toString(String one, String two)
	{
		
		if(compare<0)
		{
			return "" + wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return "" + wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}