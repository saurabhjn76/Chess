package components;
import java.io.*;

public class Location {
	private int x;
	private int y;

	public Location(int x, int y){
		assert (x>=0 && y>=0 && x<=7 && y<=7): "Can't go beyond board!";
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
}
