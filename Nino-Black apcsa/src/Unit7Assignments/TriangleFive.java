package Unit7Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < amount; i++) {
			char l = letter;
			for (int j = amount; j > i; j--) {
				for (int k = 0; k < j; k++) {
					if (l > 'Z') {
						l = 'A';
					}
					output += l;	
				}
				output +=" ";
				l++;
			}
			output += "\n";
		}
		return output;
	}
}