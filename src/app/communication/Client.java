package app.communication;

import java.util.Arrays;
import app.client.*;

import app.server.*;

public class Client {
	
	public String lines;
	public String dots0;
	public String dots1;
	public String dots2;
	public String dots3;

	public Client(String lines) {
		
		this.lines = lines;
		System.out.println(Arrays.toString(Game.dots[0]));
		this.dots0 = Arrays.toString(Game.dots[0]);
		this.dots1 = Arrays.toString(Game.dots[1]);
		this.dots2 = Arrays.toString(Game.dots[2]);
		this.dots3 = Arrays.toString(Game.dots[3]);
	}
}
