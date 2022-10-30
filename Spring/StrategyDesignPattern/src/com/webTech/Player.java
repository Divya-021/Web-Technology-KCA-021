package com.webTech;

public class Player {
	IStrategy behavior;
	String type;
	
	public Player(String type)
	{
		this.type=type;
	}
	public void setStrategy(IStrategy behavior)
	{
		this.behavior=behavior;
	}
	public void action()
	{
		System.out.println("Player: "+this.type);
		behavior.actionCommand();
	}
}
