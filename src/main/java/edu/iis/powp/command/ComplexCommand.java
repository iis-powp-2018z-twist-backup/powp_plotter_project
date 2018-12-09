package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.List;

public class ComplexCommand implements PlotterCommand {
    private List<PlotterCommand> plotterCommandList;

    public ComplexCommand(List<PlotterCommand> plotterComandsList) {
        this.plotterCommandList = plotterComandsList;
    }
    @Override
    public void execute(IPlotter iPlotter) {
        for (PlotterCommand plotterCommand : plotterCommandList) {
            plotterCommand.execute(iPlotter);
        }
    }
}
