package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class FactoryValve {

    public static ComplexCommand draw() {
    	
    	List<PlotterCommand> plotterCommand = new ArrayList<>();
    	
    		plotterCommand.add(new CommandSetPosition(0, 0));
    		plotterCommand.add(new CommandDrawLineToPosition(-100,-100));
    		plotterCommand.add(new CommandDrawLineToPosition(-100,100));
    		plotterCommand.add(new CommandDrawLineToPosition(0,0));
    		plotterCommand.add(new CommandDrawLineToPosition(0,-150));
    		plotterCommand.add(new CommandDrawLineToPosition(100,-150));
    		plotterCommand.add(new CommandSetPosition(0, 0));
    		plotterCommand.add(new CommandDrawLineToPosition(100,-100));
    		plotterCommand.add(new CommandDrawLineToPosition(100,100));
    		plotterCommand.add(new CommandDrawLineToPosition(0, 0));

    	return new ComplexCommand (plotterCommand);

    }
}