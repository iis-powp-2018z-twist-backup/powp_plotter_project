package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.FactoryRectangle;

public class SelectTestRectangleOptionListener implements ActionListener  {
	
	private DriverManager driverManager;

	public SelectTestRectangleOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

    public void actionPerformed(ActionEvent e) {
        FactoryRectangle.draw().execute(driverManager.getCurrentPlotter());;
    }

}
