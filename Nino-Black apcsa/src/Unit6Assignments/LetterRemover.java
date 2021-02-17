package Unit6Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		sentence = "";
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		setRemover(sentence, lookFor);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		for (int i = sentence.indexOf(lookFor); i != - 1;) {
			i = cleaned.indexOf(lookFor);
			cleaned = cleaned.substring(0, i) + cleaned.substring(i + 1);
			i = cleaned.indexOf(lookFor);
		}
		return cleaned + "\n";
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}