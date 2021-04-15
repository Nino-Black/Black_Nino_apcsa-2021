package Unit14Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int count = 0;
    	List<Integer> TotalRows = new ArrayList<Integer>();
    	for (int row[] : m) {
    		for (int col : row) {
    			count += col;
    		}
    		TotalRows.add(count);
    		count = 0;
    	}
    	//add code here
		return TotalRows;
    }
}
