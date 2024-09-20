package core.java.project;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import static core.java.project.CricketTeamData.*;

public class CricketMatchAnalysis {
	
	public static void main(String[] args) {
		
		Team teamIndia = new Team();
		teamIndia.build(indiaPlayingEleven, indiaReservedPool);
		
		Team teamAustralia = new Team();
		teamAustralia.build(australiaPlayingEleven, australiaReservedPool);
		
		
		
	}
	
	public static void prepareTeamIndia() {
		
	}
	
	
	
	

	public static void main1(String[] args) {

		List<Cricketer> team = new LinkedList<>();
		
		Cricketer r1 = new Cricketer("Shreyas");
		Cricketer r2 = new Cricketer("Shamit");
		Cricketer r3 = new Cricketer("Rahul");
		
		List<Cricketer> reservedPlayers = new ArrayList<>();
		reservedPlayers.add(r1);
		reservedPlayers.add(r2);
		reservedPlayers.add(r3);
		
		Cricketer c1 = new Cricketer("Virat");
		Cricketer c2 = new Cricketer("Rohit");
		Cricketer c3 = new Cricketer("Shubhman");
		team.add(c1);
		team.add(c2);
		team.add(c3);
		
		System.out.println("Current Team : ");
		team.forEach(c -> System.out.println(c.getName()));
		
		Random rd = new Random();
		
		System.out.println("Scorecard : ");
		c1.setRuns(rd.nextInt(100));
		c2.setRuns(rd.nextInt(100));
		c3.setRuns(rd.nextInt(100));
		
		team.forEach(c -> System.out.println(c.getName() + " : " + c.getRuns()));
		
		ListIterator<Cricketer> it = team.listIterator();
		boolean changesNeeded = false;
		while(it.hasNext()) {
			
			
			Cricketer c = it.next();
			
			if(c.getRuns() < 40) {
				System.out.println(c.getName() + " will be dropped for the next match");
				it.set(reservedPlayers.get(0));
				reservedPlayers.remove(0);
				reservedPlayers.add(reservedPlayers.size(), c);
				changesNeeded = true;
			}
			
		}
		
		if(!changesNeeded) {
			System.out.println("The team remains same");
		}
		System.out.println("Team for the next match");
		team.forEach(c -> System.out.println(c.getName()));
		System.out.println("________________________________________");
		reservedPlayers.forEach(c -> System.out.println(c.getName()));
		

	}

}
