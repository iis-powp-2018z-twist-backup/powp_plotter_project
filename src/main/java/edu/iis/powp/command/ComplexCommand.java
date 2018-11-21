package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.List;

public class ComplexCommand implements IPlotterCommand {
    private List<IPlotterCommand> plotterCommands;

    public ComplexCommand(List<IPlotterCommand> plotterCommands) {
        this.plotterCommands = plotterCommands;
    }

    @Override
    public void execute(IPlotter plotter) {
        for (IPlotterCommand plotterCommand : plotterCommands) {
            plotterCommand.execute(plotter);
        }
    }
}
