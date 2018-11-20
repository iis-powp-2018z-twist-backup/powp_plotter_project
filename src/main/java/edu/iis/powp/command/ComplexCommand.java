package edu.iis.powp.command;

import java.util.LinkedList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	List<PlotterCommand> plotterCommands = new LinkedList<PlotterCommand>();

	
	public void add(PlotterCommand command) {

		plotterCommands.add(command);

	}

	@Override
	public void execute(IPlotter plotter) {
		
		for (int i = 0; i < plotterCommands.size(); i++ ) {
			plotterCommands.get(i).execute(plotter);
		}
		
	}

}
