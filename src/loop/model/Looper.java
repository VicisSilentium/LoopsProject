package loop.model;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Looper
{
	//Declaration Section
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheGraveNameList();
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	
	private void fillTheGraveNameList()
	{
		graveNameList.add("Fred Alphonse Bonte");
		graveNameList.add("Grace E. Devine Bonte");
		graveNameList.add("Daniel D. Van OpDorp");
		graveNameList.add("Floyd 'Coppersmith' Gonz");
		graveNameList.add("Roma 'Tanner' Gonz");
		graveNameList.add("Jack Cushing");
		graveNameList.add("Dons M. Smith");
		graveNameList.add("Keith Paney Gillen");
		graveNameList.add("Flia Barney Gillen");
		graveNameList.add("Luana Rudmond Jolley");
		graveNameList.add("Ivan Jolley");
		graveNameList.add("Orazio G Cheet");
		
	}
	
	public String loopTestOne()
	{

		String loopResult = "";
		int numberOfTimes = 0;

		for (int counter = 17; counter >= 5; counter -= 2)
		{
			loopResult += counter + ", ";
			numberOfTimes++;
		}
		loopResult += "was the last time.";
		loopResult += "\nThe loop executed " + numberOfTimes + " Times.";
		return loopResult;
	}

	public String loopTestTwo()
	{
		String loopResult = "";
		int numberOfTimes = 0;
		for (int week = 0; week < 52; week++)
		{
			for (int day = 0; day < 7; day++)
			{
//				JOptionPane.showMessageDialog(null, "HAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHA!!!!!!");
				for (int other = 0; other < 24; other++)
				{
					for (int count = 0; count < 60; count++)
					{
						// loopResult += "count is " + count + "\n";
						for (int otherCount = 0; otherCount < 60; otherCount++)
						{
							// loopResult += " otherCount is " + otherCount +
							// "\n";
							numberOfTimes++;
						}
					}
				}
			}
		}
		loopResult += "the loop executed " + numberOfTimes + " times - wow!";
		return loopResult;
	}
}
