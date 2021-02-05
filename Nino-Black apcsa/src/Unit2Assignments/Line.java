package Unit2Assignments;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double xnum = (x2 - x1);
		double ynum = (y2 - y1);
		double num = (ynum/ xnum);
		return num;
	}

}