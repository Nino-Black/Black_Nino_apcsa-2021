package Unit16AssignmentspixLab1.classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println("Count: " + count);
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
  }
  
  public void keepOnlyRed() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
				pixelObj.setGreen(0);
			}
		}
  }	
  
  public void keepOnlyGreen() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setBlue(0);
			}
		}
  }
  
  public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(255 - pixelObj.getBlue());
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
			}
		}
  }
  
  public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				int ave = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen())
						/ 3;
				pixelObj.setBlue(ave);
				pixelObj.setRed(ave);
				pixelObj.setGreen(ave);
			}
		}
  }
  
  public void fixUnderwater() {
	  Pixel[][] pixels = this.getPixels2D();
		long total = 0;
		int num = 0;
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int ave = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen())
						/ 3;
				total += ave;
				num++;
			}
		}
		int ave = (int) (total /= num);
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(2 * (pixelObj.getBlue() - ave));
				pixelObj.setRed(2 * (pixelObj.getRed() - ave));
				pixelObj.setGreen(2 * (pixelObj.getGreen() - ave));
			}
		}
  }
  
  public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int r = 0; r < pixels.length; r++)
		{
			for (int c = 0; c < width / 2; c++)
			{
				leftPixel = pixels[r][c];
				rightPixel = pixels[r][width - 1 - c];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
  }
  
  public void mirrorHorizontal()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int height = pixels.length;
		for (int r = 0; r < height / 2; r++)
		{
			for (int c = 0; c < pixels[0].length; c++)
			{
				topPixel = pixels[r][c];
				botPixel = pixels[height - r - 1][c];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}
  
  public void mirrorHorizontalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int height = pixels.length;
		for (int r = 0; r < height / 2; r++)
		{
			for (int c = 0; c < pixels[0].length; c++)
			{
				topPixel = pixels[r][c];
				botPixel = pixels[height - r - 1][c];
				topPixel.setColor(botPixel.getColor());
			}
		}
  }
  
  public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		for (int r = 0; r < pixels[0].length && r < pixels.length; r++) {
			for (int c = r + 1; c < pixels[0].length
					&& c < pixels.length; c++) {
				topPixel = pixels[r][c];
				botPixel = pixels[c][r];
				topPixel.setColor(botPixel.getColor());
			}
		}
  }
  
  public void mirrorArms() {
	    int mirrorPoint = 193;
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    int mirrorPoint2 = 198;
	    Pixel topPixel2 = null;
	    Pixel bottomPixel2 = null;
	    Pixel[][] pixels = this.getPixels2D();
	    for (int r = 158; r < mirrorPoint; r++) {
	      for (int c = 103; c < 170; c++) {
	        topPixel = pixels[r][c];      
	        bottomPixel = pixels[mirrorPoint - r + mirrorPoint][c];
	        bottomPixel.setColor(topPixel.getColor());
	      }
	    }
	    for (int r = 171; r < mirrorPoint2; r++) {
	      for (int c = 239; c < 294; c++) {
	        topPixel2 = pixels[r][c];      
	        bottomPixel2 = pixels[mirrorPoint2 - r + mirrorPoint2][c];
	        bottomPixel2.setColor(topPixel2.getColor());
	      }
	    }
  }
  
  public void mirrorGull() {
	  int mirrorPoint = 345;
	  Pixel rightPixel = null;
	  Pixel leftPixel = null;
	  Pixel[][] pixels = this.getPixels2D();   
	  for (int r = 235; r < 323; r++) {
	    for (int c = 238; c < mirrorPoint; c++) {
	        rightPixel = pixels[r][c];      
	        leftPixel = pixels[r][mirrorPoint - c + mirrorPoint/3];
	        leftPixel.setColor(rightPixel.getColor());
	    }
	  }
  }
  
  public void copyPartial(Picture fromPic, int startRow, int startCol, int fromRowStart, int fromColStart, int fromRowEnd, int fromColEnd) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		if (fromRowStart < 0 || fromRowStart > fromPixels.length) {
			fromRowStart = 0;
		}
		if (fromColStart < 0 || fromColStart > fromPixels[0].length) {
			fromColStart = 0;
		}
		if (fromRowEnd < 0 || fromRowEnd > fromPixels.length) {
			fromRowEnd = fromPixels.length;
		}
		if (fromColEnd < 0 || fromColEnd > fromPixels[0].length) {
			fromColEnd = fromPixels[0].length;
		}
		for (int fromRow = fromRowStart, toRow = startRow; fromRow < fromRowEnd
				&& toRow < toPixels.length; fromRow++, toRow++)
		{
			for (int fromCol = fromColStart, toCol = startCol; fromCol < fromColEnd
					&& toCol < toPixels[0].length; fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
  }
  
  public void myCollage() {
		
	Picture robot = new Picture("robot.jpg");
	
	Picture swan = new Picture("swan.jpg");
	
	Picture kitten = new Picture("kitten2.jpg");

	this.copy(robot, 0, 0);
	robot.mirrorDiagonal();
	this.copy(robot, 100, 0);
	swan.zeroBlue();
	this.copyPartial(swan, 200, 0, 65, 308, 120, 400);
	kitten.grayscale();
	this.copyPartial(kitten, 300, 0, 78, 107, 202, 352);
	this.mirrorVertical();
  }
  
  public void edgeDetection2(int edgeDist) {
		Pixel leftPixel = null;
		Pixel nextPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color nextColor = null;
		for (int r = 0; r < pixels.length; r++)
		{
			for (int c = 0; c < pixels[0].length; c++)
			{
				if (c < pixels[0].length - 1) {
					leftPixel = pixels[r][c];
					nextPixel = pixels[r][c + 1];
					nextColor = nextPixel.getColor();
					if (leftPixel.colorDistance(nextColor) > edgeDist) {
						leftPixel.setColor(Color.BLACK);
						continue;
					}
				}
				if (r < pixels.length - 1) {
					nextPixel = pixels[r + 1][c];
					nextColor = nextPixel.getColor();
					if (leftPixel.colorDistance(nextColor) > edgeDist) {
						leftPixel.setColor(Color.BLACK);
						continue;
					}
				}
				leftPixel.setColor(Color.WHITE);
			}
		}
  }
  
  public int getCountRedOverValue(int val) {
      int count = 0;
      Pixel[][] pixels = this.getPixels2D();
      Pixel currPixel = null;
      for (int r = 0; r < pixels.length; r++) {
          for (int c = 0; c < pixels[0].length; c++) {
              currPixel = pixels[r][c];
              if (currPixel.getRed() > val) {
                  count++;
              }
          }
      }
      return count;
  }
  
  public void setRedToHalfValueInTopHalf() {
      Pixel[][] pixels = this.getPixels2D();
      Pixel currPixel = null;
      for (int r = 0; r < pixels.length / 2; r++) {
          for ( int c = 0; c < pixels[0].length; c++) {
              currPixel = pixels[r][c];
              currPixel.setRed( currPixel.getRed() / 2 );
          }
      }
  }
  
  public void clearBlueOverValue(int val) {
      Pixel[][] pixels = this.getPixels2D();
      Pixel currPixel = null;
      for (int r = 0; r < pixels.length; r++) {
          for (int c = 0; c < pixels[0].length; c++) {
              currPixel = pixels[r][c];
              if (currPixel.getBlue() > val) {
                  currPixel.setBlue( 0 );
              }
          }
      }
  }

  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
