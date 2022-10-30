package com.webTech;

public class CounterStrike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player terrorist= new Player("Terrorist");
		Player counter_Terr= new Player("Counter Terrorist");
		
		System.out.println("Before bomb is planted");
		terrorist.setStrategy(new AggresiveStrategy());
		counter_Terr.setStrategy(new DefensiveStrategy());
		
		terrorist.action();
		counter_Terr.action();
		
		System.out.println("After bomb planted");
		terrorist.setStrategy(new DefensiveStrategy());
		counter_Terr.setStrategy(new AggresiveStrategy());
		
		terrorist.action();
		counter_Terr.action();
	}

}
