package edu.iis.powp.factory;

import java.util.ArrayList;
import java.util.List;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class TriangleFactory extends ShapeFactory {
	
	private int width;
	private int height;
	private int x;
	private int y;
	List<PlotterCommand> plotterCommands = new ArrayList<>();

	public TriangleFactory(int width, int height) {
		this(width, height, 0, 0);
	}

	public TriangleFactory(int width, int height, int x, int y) {
		
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		
	}

	@Override
	public ComplexCommand createShape() {
		
		ComplexCommand command = new ComplexCommand(plotterCommands);
		command.addPlotterCommand(new CommandSetPosition(x, y));
		command.addPlotterCommand(new CommandDrawLineToPosition(x + width, y));
		command.addPlotterCommand(new CommandDrawLineToPosition(x, y + height));
		command.addPlotterCommand(new CommandDrawLineToPosition(x, y));
		
		return command;
	}
	
}
