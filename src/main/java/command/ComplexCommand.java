package command;

import java.util.LinkedList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand{
	List<PlotterCommand> complexCommands;
	
	public void addCommand(PlotterCommand complexCommand){
		complexCommands.add(complexCommand);
	}
	
	public ComplexCommand(List<PlotterCommand> commandList){
		complexCommands = commandList;
	}
	
	public ComplexCommand(){
		complexCommands = new LinkedList<PlotterCommand>();
	}
		
	@Override
	public void execute(IPlotter driver) {
		// TODO Auto-generated method stub
		
		for(PlotterCommand complexCommand : complexCommands){
			complexCommand.execute(driver);
		}
	}
}
