package edu.iis.powp.command;

import java.util.List;
import java.util.ArrayList;

public class FactoryRectangle {
		
    public static ComplexCommand draw() {
        List<PlotterCommand> plotterCommand = new ArrayList<>();
        plotterCommand.add(new CommandSetPosition(-50, -50));
        plotterCommand.add(new CommandDrawLineToPosition(-50, 100));
        plotterCommand.add(new CommandDrawLineToPosition(50, 100));
        plotterCommand.add(new CommandDrawLineToPosition(50, -50));
        plotterCommand.add(new CommandDrawLineToPosition(-50, -50));
        return new ComplexCommand (plotterCommand);
    }
}
