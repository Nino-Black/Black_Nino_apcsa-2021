package Unit11Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.ArrayList;

public class ToyRunner
{
	public static void main(String[] args)
	{
		ArrayList toys=new ArrayList<Toy>();
		Toy h = new Toy(1,"sorry");
		System.out.println(h);
		Toy  k= new Toy(5,"gi joe");
		System.out.println(k);
		toys.add(h);
		toys.add(k);
	}
}