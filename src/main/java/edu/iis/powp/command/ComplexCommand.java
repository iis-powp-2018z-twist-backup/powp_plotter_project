package edu.iis.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

    
    private List<PlotterCommand> plotterCommands;
    
	public ComplexCommand(List<PlotterCommand> plotterCommands) {
    	this.plotterCommands = plotterCommands;
	}


	@Override 
	public void execute(IPlotter plotter) {
       for (PlotterCommand plotterCommandIterator : plotterCommands) {
           plotterCommandIterator.execute(plotter);
       }
   }
}