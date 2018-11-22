package edu.iis.powp.command;

public class FactoryCircle {

    public ComplexCommand draw() {
    	
        ComplexCommand command = new ComplexCommand();
        
        int MAX_X = 50;
		double RADIUS=50;
        double y=0;
        double MIN_X = -50;
        
        
        command.add(new CommandSetPosition((int)MIN_X, 0));

        	for(double x=MIN_X;x<MAX_X;x++ ) {
				
				if(x<MAX_X)
        		y=Math.sqrt(Math.pow(x, 2)+Math.pow(RADIUS, 2));
        		command.add(new CommandDrawLineToPosition((int)x,(int) y));
        	} 	     
			for(double x=MAX_X;x<MIN_X;x-- ) {
				
				if(x<MAX_X)
        		y=Math.sqrt(Math.pow(x, 2)+Math.pow(RADIUS, 2));
        		command.add(new CommandDrawLineToPosition((int)x,(int) -y));
        	} 			

		return command;       
    }

}
