package Unit11Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ArrayList toys=new ArrayList<Toy>();
		Toy h=new Toy(4,"sorry");
		
		Toy b=new Toy(1,"bat");
	
		Toy c=new Toy(2,"train");

		Toy l=new Toy(2,"ball");
	
		Toy j=new Toy(2,"teddy");

		toys.add(h);
		toys.add(b);
		toys.add(c);
		toys.add(j);
		toys.add(l);
		for(int i = 0; i < toys.size() - 1;i++) {
			System.out.println(toys);
		}
		System.out.println("max == sorry");
	}
}