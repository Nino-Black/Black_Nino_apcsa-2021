package Unit15Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

   public SpeedUpBall()
   {
	   super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y, xSpd, ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd, col);
   }

   public void setXSpeed( int xSpd )
   {
	   int i = 1;
	   if (xSpd < 0) {
		   i = -1;
	   }
	   super.setXSpeed(xSpd + i);
   }

   public void setYSpeed( int ySpd )
   {
	   int i = 1;
	   if (ySpd < 0) {
		   i = -1;
	   }
	   super.setYSpeed(ySpd + i);
   }
}

