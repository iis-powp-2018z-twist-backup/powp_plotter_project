package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.List;

public class ComplexCommand implements PlotterComand {
    private List<PlotterComand> plotterComandList;

    public ComplexCommand(List<PlotterComand> plotterComandsList) {
        this.plotterComandList = plotterComandsList;
    }
    @Override
    public void execute(IPlotter iPlotter) {
        for (PlotterComand plotterComand : plotterComandList) {
            plotterComand.execute(iPlotter);
        }
    }
}
