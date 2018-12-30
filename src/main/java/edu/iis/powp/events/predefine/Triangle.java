package edu.iis.powp.events.predefine;

import command.CommandDrawLine;
import command.CommandSet;
import command.ComplexCommand;

public class Triangle {
	
	public ComplexCommand getTriangleDrawCommand(int x, int y, int x1, int y1, int x2, int y2)
	{
		ComplexCommand complexCommand = new ComplexCommand();
		
		complexCommand.addCommand(new CommandSet(x, y));
		
		complexCommand.addCommand(new CommandDrawLine(x1, y1));
		complexCommand.addCommand(new CommandDrawLine(x2, y2));
		complexCommand.addCommand(new CommandDrawLine(x, y));
				
		return complexCommand;
	}


}
