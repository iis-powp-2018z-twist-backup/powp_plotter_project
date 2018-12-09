package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

import java.util.LinkedList;

public class Rectangle {
    private LinkedList<PlotterCommand> plotterCommandList;
    private int x = 0;
    private int y = 0;
    private int xLength = 0;
    private int yLength = 0;

    public Rectangle(int x, int y, int xLength, int yLength) {
        plotterCommandList = new LinkedList<>();
        this.x = x - xLength / 2;
        this.y = y - yLength / 2;
        this.xLength = xLength;
        this.yLength = yLength;
    }

    public void createRectangle() {
        plotterCommandList.add(new CommandSetPosition(x, y));
        plotterCommandList.add(new CommandDrawLineToPosition(x + xLength, y));
        plotterCommandList.add(new CommandDrawLineToPosition(x + xLength, y + yLength));
        plotterCommandList.add(new CommandDrawLineToPosition(x , y + yLength));
        plotterCommandList.add(new CommandDrawLineToPosition(x , y ));


    }

    public ComplexCommand getRectangle() {
        createRectangle();
        return new ComplexCommand(plotterCommandList);
    }

}
