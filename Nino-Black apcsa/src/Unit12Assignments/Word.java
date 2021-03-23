package Unit12Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{	
		for(int i = 0;i < word.length - 1;i++)
	    {
	      int spot = i; 
	      for(int j = i;j < word.length; j++){
	        if(word[j].compareTo(word[spot])>0)
	          spot=j;
	      }
	      Comparable save = word[i];
	      word[i]= word[spot];
	      word[spot] = save;

		return 
	}

	public String toString()
	{
		return word;
	}
}