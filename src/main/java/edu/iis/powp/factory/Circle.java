package edu.iis.powp.factory;

import edu.iis.powp.command.ComandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterComand;

import java.util.List;

import static java.lang.Math.*;

public class Circle {
    private List<PlotterComand> plotterComandList;
    private int x = 0;
    private int y = 0;
    private int radius = 0;

    public void createCircle() {
        plotterComandList.add(new CommandSetPosition((int)sin(x*PI/180) * radius, (int)sin(y*PI/180) * radius));
        for (int i = 0; i < 360; i += 2) {
            int x1 = (int) sin(i*PI/180) * radius;
            int y1 = (int) sin(i*PI/180) * radius;
            plotterComandList.add(new ComandDrawLineToPosition(x1, y1));

        }
    }
    public ComplexCommand getCircle() {
        createCircle();
        return new ComplexCommand(plotterComandList);
    }
}
