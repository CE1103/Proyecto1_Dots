package app.communication;

import java.util.Arrays;

import app.server.Main;

public class Client {
	
	public String lines;
	public String dots0;
	public String dots1;
	public String dots2;
	public String dots3;
	public String dots4;
	public String dots5;
	public String dots6;
	public String dots7;
	public boolean turn;
	public boolean gameOn;
	public int scoreP1;
	public int scoreP2;

	public Client() {

		this.scoreP1 = Game.P1.getScore();
		this.scoreP2 = Game.P2.getScore();
		lines = Arrays.toString(Main.linesStatic);
		this.dots0 = Arrays.toString(Game.dots[0]);
		this.dots1 = Arrays.toString(Game.dots[1]);
		this.dots2 = Arrays.toString(Game.dots[2]);
		this.dots3 = Arrays.toString(Game.dots[3]);
		this.dots4 = Arrays.toString(Game.dots[4]);
		this.dots5 = Arrays.toString(Game.dots[5]);
		this.dots6 = Arrays.toString(Game.dots[6]);
		this.dots7 = Arrays.toString(Game.dots[7]);
		
		
	}
		
}
