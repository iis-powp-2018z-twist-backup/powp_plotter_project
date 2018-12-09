package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class ComandDrawLineToPosition implements PlotterComand {
    private int x;
    private int y;

    public drawLineToPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void execute(IPlotter iPlotter) {
        iPlotter.drawTo(x, y);
    }
}
