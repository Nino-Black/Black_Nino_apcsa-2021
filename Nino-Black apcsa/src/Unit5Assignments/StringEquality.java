package Unit5Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
	}

	public StringEquality(String one, String two)
	{
		setWords(wordOne, wordTwo);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality(String one, String two)
	{
		if (wordOne.equals(wordTwo)) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString()
	{
		if (checkEquality(wordOne, wordTwo)) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		else {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
	}
}