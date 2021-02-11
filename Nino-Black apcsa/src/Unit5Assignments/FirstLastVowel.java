package Unit5Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{  
       String vowels = "AEIOUaeiou";
	   String firstL = a.substring(0);
	   String lastL = a.substring(a.length() - 1);
	   
	   if ((firstL.equals(vowels))) {
		   System.out.println("yes");
	   }
	   else if ((lastL.equals(vowels))) {
		   System.out.println("yes");
	   }
       return "no";
	   
	}
}