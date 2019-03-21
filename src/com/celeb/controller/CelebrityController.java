package com.celeb.controller;
import java.util.ArrayList;
import com.celeb.model.Celebrity;
public class CelebrityController
{
private ArrayList<Celebrity> celebrityList;
private String currentClue;
private Celebrity currentCelebrity;

public CelebrityController()
{
	this.celebrityList = new ArrayList<Celebrity>();
	
}
public void addCelebrity(String name, String clue, String type)
{
	Celebrity toBeAdded = new Celebrity(name, clue);
	celebrityList.add(toBeAdded);
}
public String getClue()
{
	return currentCelebrity.getClue();
}
public Celebrity getRandomCelebrity()
{
	int randomIndex = (int)(Math.random() * celebrityList.size());
	currentCelebrity = celebrityList.remove(randomIndex);
	return currentCelebrity;
}
public void playGame();
{
	
	
}
public void start()
{

}
}
