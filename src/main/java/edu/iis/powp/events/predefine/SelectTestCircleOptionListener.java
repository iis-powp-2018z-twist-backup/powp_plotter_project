package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.FactoryCircle;
import edu.iis.powp.command.FactoryRectangle;

public class SelectTestCircleOptionListener implements ActionListener  {
	
	private DriverManager driverManager;
	
	public SelectTestCircleOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

    public void actionPerformed(ActionEvent e) {
        FactoryCircle.draw();
    }



}
