package command;

import edu.iis.client.plottermagic.IPlotter;


public class CommandDrawLine implements PlotterCommand {
	
	private int x, y;
	
	public CommandDrawLine(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public void execute(IPlotter driver) {
					
	 		driver.drawTo(getX(), getY());
		}
		
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
