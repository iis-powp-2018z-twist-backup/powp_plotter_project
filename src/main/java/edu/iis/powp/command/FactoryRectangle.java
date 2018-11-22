package edu.iis.powp.command;

public class FactoryRectangle {
		
    public ComplexCommand draw() {
    	
        ComplexCommand command = new ComplexCommand();
        command.add(new CommandSetPosition(-50, -50));
        command.add(new CommandDrawLineToPosition(-50, 100));
        command.add(new CommandDrawLineToPosition(50, 100));
        command.add(new CommandDrawLineToPosition(50, -50));
        command.add(new CommandDrawLineToPosition(-50, -50));
        return command;
    }

}
