package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    public static ComplexCommand drawRectangle(int x, int y, int width, int height) {
        List<PlotterCommand> commands = new ArrayList<>();

        commands.add(new CommandSetPosition(x, y));
        commands.add(new CommandDrawLineToPosition(x + width, y));
        commands.add(new CommandDrawLineToPosition(x + width, y - height));
        commands.add(new CommandDrawLineToPosition(x, y - height));
        commands.add(new CommandDrawLineToPosition(x, y));

        return new ComplexCommand(commands);
    }

    public static ComplexCommand drawTriangle(int x0, int y0, int x1, int y1, int x2, int y2) {
        List<PlotterCommand> commands = new ArrayList<>();

        commands.add(new CommandSetPosition(x0, y0));
        commands.add(new CommandDrawLineToPosition(x1, y1));
        commands.add(new CommandDrawLineToPosition(x2, y2));
        commands.add(new CommandDrawLineToPosition(x0, y0));

        return new ComplexCommand(commands);
    }

}
