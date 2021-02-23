package Unit7Assignments;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		 playChoice = "";
	     compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(playChoice);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
        out.println("player had " + playChoice);
        double compC = 3 * Math.random();
        int comp = (int)compC;
        if (comp == 0)
            compChoice = "r";
        else if (comp == 1)
            compChoice = "p";
        else
            compChoice = "s";

        out.println("computer had " + compChoice);
        determineWinner();
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice == compChoice) {
            out.println("!Draw Game");
            winner = "!Draw Game!";
		}
		return winner;
	}

	public String toString()
	{
		return determineWinner();
	}
}