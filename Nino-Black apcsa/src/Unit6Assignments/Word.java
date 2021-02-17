package Unit6Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;
	private char fC;
	private char lC;
	private String back="";

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
	    fC = word.charAt(0);
		return fC;
	}

	public char getLastChar()
	{
		lC = word.charAt(word.length() - 1);
		return lC;
	}

	public String getBackWards()
	{
		for (int i = word.length()- 1; i >= 0; i--) {
			back = back + word.charAt(i);
		}
		return back;
	}

 	public String toString()
 	{
 		return word;
	}
}