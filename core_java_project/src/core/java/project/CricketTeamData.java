package core.java.project;

import java.util.List;

public class CricketTeamData {
	
	public static List<Cricketer> indiaPlayingEleven;
	public static List<Cricketer> indiaReservedPool;
	public static List<Cricketer> australiaPlayingEleven;
	public static List<Cricketer> australiaReservedPool;
	
	static {
		indiaPlayingEleven = List.of(new Cricketer("Rohit Sharma"), new Cricketer("Shubhman Gill"),
				new Cricketer("Virat Kohli"), new Cricketer("KL Rahul"), new Cricketer("Surya"),
				new Cricketer("Rishabh Pant"), new Cricketer("Jadeja"), new Cricketer("Washington Sundar"),
				new Cricketer("Mohd Siraj"), new Cricketer("Bumrah"), new Cricketer("Sami"));
		
		indiaReservedPool = List.of(new Cricketer("Dinesh Karthik"), new Cricketer("Abhishek Nayar"),
				new Cricketer("Shreyas"));
	}
	
	static {
		australiaPlayingEleven = List.of(new Cricketer("ab"), new Cricketer("cd"),
				new Cricketer("ef"), new Cricketer("gh"), new Cricketer("ij"),
				new Cricketer("kl"), new Cricketer("mn"), new Cricketer("op"),
				new Cricketer("qr"), new Cricketer("st"), new Cricketer("uv"));
		
		australiaReservedPool = List.of(new Cricketer("xy"), new Cricketer("yz"),
				new Cricketer("za"));
	}

}
