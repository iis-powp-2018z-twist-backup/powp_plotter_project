package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

import java.util.LinkedList;

import static java.lang.Math.*;

public class Circle {
    private LinkedList<PlotterCommand> plotterCommandList;
    private int x = 0;
    private int y = 0;
    private int radius = 0;

    public Circle(int x,int y,int radius) {
        plotterCommandList = new LinkedList<>();
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void createCircle() {
        plotterCommandList.add(new CommandSetPosition((int)sin(x*PI/180) * radius, (int)sin(y*PI/180) * radius));
        for (int i = 0; i < 360; i += 2) {
            int x1 = (int) sin(i*PI/180) * radius;
            int y1 = (int) sin(i*PI/180) * radius;
            plotterCommandList.add(new CommandDrawLineToPosition(x1, y1));

        }
    }
    public ComplexCommand getCircle() {
        createCircle();
        return new ComplexCommand(plotterCommandList);
    }
}
