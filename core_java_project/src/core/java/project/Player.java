package core.java.project;

import java.io.IOException;

public class Player {

	protected String name;

	public Player(String name) {
		super();
		this.name = name;
		
	}
	
	public Player() {
		
	}

	public Player play() throws IOException {
		System.out.println(name + " plays");
		return new Player();
	}

}
