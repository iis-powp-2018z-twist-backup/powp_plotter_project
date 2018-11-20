package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand {
	
	public CommandSetPosition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	private int x = 0;
	private int y = 0;
	@Override
	public void execute(IPlotter plotter) {
		plotter.setPosition(x, y);
		
	}

}
