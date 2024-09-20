package core.java.project;

import java.util.LinkedList;
import java.util.List;

public class Team {
	
	List<Cricketer> playingEleven = new LinkedList<>();
	
	List<Cricketer> reservedPlayersList;

	public Team() {
		super();
	}
	
	public void build(List<Cricketer> playingEleven, List<Cricketer> reservedPlayersList) {
		
		for(Cricketer c : playingEleven) {
			this.playingEleven.add(c);
		}
		
		this.reservedPlayersList = reservedPlayersList;
		
	}
	

}
