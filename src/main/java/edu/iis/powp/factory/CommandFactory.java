package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class CommandFactory {

    public static ComplexCommand getRectangleCommand() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new CommandSetPosition(-120, -120));
        complexCommand.addCommand(new CommandDrawLineToPosition(120, -120));
        complexCommand.addCommand(new CommandDrawLineToPosition(120, 50));
        complexCommand.addCommand(new CommandDrawLineToPosition(-120, 50));
        complexCommand.addCommand(new CommandDrawLineToPosition(-120, -120));
        return complexCommand;
    }

    public static ComplexCommand getTriangleCommand() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new CommandSetPosition(-120, -120));
        complexCommand.addCommand(new CommandDrawLineToPosition(120, -120));
        complexCommand.addCommand(new CommandDrawLineToPosition(0, 50));
        complexCommand.addCommand(new CommandDrawLineToPosition(-120, -120));

        return complexCommand;
    }
}
