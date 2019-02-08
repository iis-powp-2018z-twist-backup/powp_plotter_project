package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    public static ComplexCommand drawRectangle(int x, int y, int width, int height) {
        List<IPlotterCommand> plotterCommands = new ArrayList<>();

        plotterCommands.add(new CommandSetPosition(x, y));
        plotterCommands.add(new CommandDrawLineToPosition(x + width, y));
        plotterCommands.add(new CommandDrawLineToPosition(x + width, y + height));
        plotterCommands.add(new CommandDrawLineToPosition(x, y + height));
        plotterCommands.add(new CommandDrawLineToPosition(x, y));

        return new ComplexCommand(plotterCommands);
    }

    public static ComplexCommand drawTriangle(int x0, int y0, int x1, int y1, int x2, int y2) {
        List<IPlotterCommand> plotterCommands = new ArrayList<>();

        plotterCommands.add(new CommandSetPosition(x0, y0));
        plotterCommands.add(new CommandDrawLineToPosition(x1, y1));
        plotterCommands.add(new CommandDrawLineToPosition(x2, y2));
        plotterCommands.add(new CommandDrawLineToPosition(x0, y0));

        return new ComplexCommand(plotterCommands);
    }
}
