package com.celeb.model;
import java.util.ArrayList;
public class Celebrity
{
private String name;
private int age;
private String gender;
private String topic;
private String clue;
private ArrayList<String> clueList;
public Celebrity(String name, String clue)
{
	this.clueList = new ArrayList<String>();
	this.name = name;
	this.clue = clue;
	this.age = age;
	this.gender = gender;
	this.topic = topic;
}
public String getClue()
{
	return clue;
}
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public String getGender()
{
	return gender;
}
public String getTopic()
{
	return topic;
}
public ArrayList<String> getClueList()
{
	return clueList;
}
public void play()
{
	if(celebGameList != null && celebGameList.size() > 0)
	{
		this.gameCelebrity = celebGameList.get(0);
		gameFrame.replaceScreen("Game");
	}
}
}
