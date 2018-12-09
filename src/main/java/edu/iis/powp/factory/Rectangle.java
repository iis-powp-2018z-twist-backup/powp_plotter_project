package edu.iis.powp.factory;

import edu.iis.powp.command.ComandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterComand;

import java.util.List;

public class Rectangle {
    private List<PlotterComand> plotterComandList;
    private int x = 0;
    private int y = 0;
    private int xLength = 0;
    private int yLength = 0;

    public void createRectangle() {
        plotterComandList.add(new CommandSetPosition(x, y));
        plotterComandList.add(new ComandDrawLineToPosition(x + xLength, y));
        plotterComandList.add(new ComandDrawLineToPosition(x + xLength, y + yLength));
        plotterComandList.add(new ComandDrawLineToPosition(x , y + yLength));
        plotterComandList.add(new ComandDrawLineToPosition(x , y ));


    }

    public ComplexCommand getRectangle() {
        createRectangle();
        return new ComplexCommand(plotterComandList);
    }

}
