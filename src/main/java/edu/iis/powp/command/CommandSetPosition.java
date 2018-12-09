package edu.iis.powp.command;
import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterComand {
    private int x;
    private int y;

    public setPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;

    }
    @Override
    public void execute(IPlotter iPlotter) {
        iPlotter.setPosition(x,y);
    }
}
