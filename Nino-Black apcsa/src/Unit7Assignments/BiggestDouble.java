package Unit7Assignments;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double max = 0.0;
		if (one>two&&one>three&&one>four){
			max = one;
	    }
		else if(two>one&&two>three&&two>four){
				max = two;
		}
		else if (three>one&&three>two&&three>four){
				max = three;
		}
		else if (four>one&&four>two&&four>three){
				max = four;
		}
		
		return max;
	}
	

	public String toString()
	{
	   return "" + one + " " + two + " " + three + " " + four;
	}
}