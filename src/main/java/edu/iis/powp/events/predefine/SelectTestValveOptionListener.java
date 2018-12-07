package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.FactoryValve;

public class SelectTestValveOptionListener implements ActionListener  {
	
	private DriverManager driverManager;
	
	public SelectTestValveOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

    public void actionPerformed(ActionEvent e) {
        FactoryValve.draw().execute(driverManager.getCurrentPlotter());;
    }



}
