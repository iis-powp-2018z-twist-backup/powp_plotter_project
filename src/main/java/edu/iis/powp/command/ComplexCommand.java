package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements PlotterCommand {

    private List<PlotterCommand> commands;

    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    @Override
    public void execute(IPlotter plotter) {
        commands.forEach(c -> execute(plotter));
    }

    public void addCommand(PlotterCommand command) {
        commands.add(command);
    }
}
