package edu.iis.powp.events.predefine;

import command.CommandDrawLine;
import command.CommandSet;
import command.ComplexCommand;

public class Rectangle {
	
	public ComplexCommand getRectangleDrawCommand(int x, int y, int x2, int y2)
	{
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.addCommand(new CommandSet(x, y));
		complexCommand.addCommand(new CommandDrawLine(x+x2, y));
		complexCommand.addCommand(new CommandDrawLine(x+x2, y+y2));
		complexCommand.addCommand(new CommandDrawLine(x, y+y2));
		complexCommand.addCommand(new CommandDrawLine(x, y));
		
		return complexCommand;
	}

}
