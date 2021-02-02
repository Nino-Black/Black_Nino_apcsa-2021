package Unit1InstructionExamples;

//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
   }

   public void printTwentyStars()
   {
	   out.println("********************");
	   printTwentyStars();
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
	   printTwentyDashes();
   }

   public void printTwoBlankLines()
   {
	   out.println("                    ");
	   out.println("                    ");
	   printTwoBlankLines();
   }
   
   public void printASmallBox()
   {	
	   printTwoBlankLines();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   printTwoBlankLines();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }   
}