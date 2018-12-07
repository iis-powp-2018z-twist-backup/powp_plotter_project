package edu.iis.powp.factory;

import java.util.ArrayList;
import java.util.List;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class RectangleFactory extends ShapeFactory {
	private int width;
	private int height;
	private int startX;
	private int startY;
	List<PlotterCommand> plotterCommands = new ArrayList<>();

	public RectangleFactory(int width, int height) {
		this(width, height, 0, 0);
	}

	public RectangleFactory(int width, int height, int startX, int startY) {
		this.width = width;
		this.height = height;
		this.startX = startX;
		this.startY = startY;
	}

	@Override
	public ComplexCommand createShape() {
		ComplexCommand command = new ComplexCommand(plotterCommands);
		command.addPlotterCommand(new CommandSetPosition(startX, startY));
		command.addPlotterCommand(new CommandDrawLineToPosition(startX + width, startY));
		command.addPlotterCommand(new CommandDrawLineToPosition(startX + width, startY + height));
		command.addPlotterCommand(new CommandDrawLineToPosition(startX, startY + height));
		command.addPlotterCommand(new CommandDrawLineToPosition(startX, startY));
		return command;
	}
}