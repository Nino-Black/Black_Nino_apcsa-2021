package Unit6Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   setNum(0);
   }
   
   public Perfect (int num) {
	   setNum(num);
   }
   
   public void setNum(int num) {
	   number = num;
   }
	//add a set method

	public boolean isPerfect()
	{
		int sum = 0;
		for (int num = 1; num < number; num++) {
			if (number % num ==0) {
				sum = sum + num;
			}
		}
		if (sum == number) {
			return true;
		}
		return false;
	}

	//add a toString	
	public String toString() {
		if (isPerfect()) {
			return "" + number + " is perfect.\n";
		}
		return "" + number + " is not perfect.\n";
	}
}