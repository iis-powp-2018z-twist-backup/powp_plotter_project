package edu.iis.powp.events.predefine;

import command.CommandDrawLine;
import command.CommandSet;
import command.ComplexCommand;

public class Rectangle {
	
	public ComplexCommand getRectangleDrawCommand(int x, int y, int length_x, int length_y)
	{
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.addCommand(new CommandSet(x, y));
		complexCommand.addCommand(new CommandDrawLine(x+length_x, y));
		complexCommand.addCommand(new CommandDrawLine(x+length_x, y+length_y));
		complexCommand.addCommand(new CommandDrawLine(x, y+length_y));
		complexCommand.addCommand(new CommandDrawLine(x, y));
		
		return complexCommand;
	}

}
