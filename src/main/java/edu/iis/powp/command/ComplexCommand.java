package edu.iis.powp.command;

import java.util.List;
import java.util.Vector;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	
//    Vector<PlotterCommand> plotterCommands = new Vector<PlotterCommand>();
//    public void add(PlotterCommand command) {
//       plotterCommands.add(command);
//   }
//    
    
    private List<PlotterCommand> plotterCommands;
	private CommandDrawLineToPosition commandDrawLineToPosition;
	private CommandSetPosition commandSetPosition;

	public ComplexCommand(List<PlotterCommand> plotterCommands) {
    	this.plotterCommands = plotterCommands;
	}

	public ComplexCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override public void execute(IPlotter plotter) {
       for (PlotterCommand plotterCommandIterator : plotterCommands) {
           plotterCommandIterator.execute(plotter);
       }
   }

	public void add(CommandSetPosition commandSetPosition) {
		this.commandSetPosition = commandSetPosition;
		
	}

	public void add(CommandDrawLineToPosition commandDrawLineToPosition) {
		this.commandDrawLineToPosition = commandDrawLineToPosition;
		
	}
}
