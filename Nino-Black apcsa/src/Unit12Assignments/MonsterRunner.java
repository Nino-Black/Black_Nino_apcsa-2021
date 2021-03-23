package Unit12Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name : ");
		String name = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter 1st monster's size : ");
		int size= keyboard.nextInt();
		
		//instantiate monster one
		Skeleton m= new Skeleton(name, size);
		
		//ask for name and size
		System.out.println("Enter 2nd monster's name : ");
		String n = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter 2nd monster's size : ");
		int s= keyboard.nextInt();
		
		//instantiate monster two
		Skeleton other= new Skeleton(n, s);
		
		System.out.println();
		System.out.println("Monster 1 -" + m);
		System.out.println("Monster 2 -" + other);
		System.out.println();
		System.out.println("Monster one is" + ((m.isBigger(other)) ? " bigger " : " smaller ") + "than Monster two.");
		System.out.println("Monster one" + ((m.namesTheSame(other)) ? " has " : " does not have ") + "the same name as Monster two.");
	}
}