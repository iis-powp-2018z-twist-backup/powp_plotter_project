package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.factory.CommandFactory;

import java.awt.event.ActionEvent;

public class DrawRectangleListener extends AbstractActionListener {

    public DrawRectangleListener(DriverManager driverManager) {
        super(driverManager);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        IPlotter plotter = driverManager.getCurrentPlotter();
        ComplexCommand complexCommand = CommandFactory.getRectangleCommand();
        complexCommand.execute(plotter);
    }
}
