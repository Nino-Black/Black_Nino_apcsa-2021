package Unit8Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int total = 0;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] > ray[ray.length - 1])
			{
				total += ray[i];	
			}
			else
				total += 0;
		}
		if (total <= 0)
			total = -1;
		return total;
	}
}