package Unit8Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public int go(int[] ray)
	{
		boolean x = false;
		int d = 0;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 != 0) {
				x = true;
			}
			if (x && ray[i] % 2 != 0) {
				d++;
			}
			if (x && ray[i] % 2 == 0) {
				return d;
			}
		}
		return -1;
	}
}