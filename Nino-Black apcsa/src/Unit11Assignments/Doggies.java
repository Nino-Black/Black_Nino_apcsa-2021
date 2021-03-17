package Unit11Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		if (spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		String nameOfOldest = "";
		int ageOfOldest = Integer.MIN_VALUE;
		for (Dog d : pups) {
			if (d.getAge() > ageOfOldest) {
				ageOfOldest = d.getAge();
				nameOfOldest = d.getName();
			}
		}
		return nameOfOldest;
	}

	public String getNameOfYoungest()
	{
		String nameOfYoungest = "";
		int ageOfYoungest = Integer.MAX_VALUE;
		for (Dog d : pups) {
			if (d.getAge() < ageOfYoungest) {
				ageOfYoungest = d.getAge();
				nameOfYoungest = d.getName();
			}
		}
		return nameOfYoungest;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}