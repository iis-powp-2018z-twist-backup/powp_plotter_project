package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.List;

public class ComplexCommand implements PlotterCommand {

    private List<PlotterCommand> commands;


    public ComplexCommand(List<PlotterCommand> commands) {
        this.commands = commands;
    }


    @Override
    public void execute(IPlotter driver) {
        for (PlotterCommand command: commands) {
            command.execute(driver);
        }
    }
}
