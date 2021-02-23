package Unit7Assignments;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int min(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            return a;
        }

        if ((b < a) && (b < c)) {
            return b;
        }

        return c;
    }
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int lowest = min(a, b, c);

        for (int i = lowest; i > 0; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                for (int j = i; j > 0; j--) {
                    if ((i % j == 0) && (c % j == 0)) {
                        return j;
                    }
                }
            }
        }

        return 1;
    }

	public String toString()
	{
		String output="";
		
		
		
		
		
		
		
		
		return output+"\n";
	}
}