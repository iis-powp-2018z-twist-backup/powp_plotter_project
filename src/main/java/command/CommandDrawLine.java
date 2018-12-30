package command;

import edu.iis.client.plottermagic.IPlotter;


public class CommandDrawLine implements PlotterCommand {
	
	private int x, y;
	
	public CommandDrawLine(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void execute(IPlotter driver) {
					
	 		driver.drawTo(x, y);
		}
}
