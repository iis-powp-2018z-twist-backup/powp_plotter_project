package edu.iis.powp.events.predefine;

import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestTriangleOptionListener implements ActionListener {
	private DriverManager driverManager;

	public SelectTestTriangleOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CommandFactory.drawTriangle(0, 0, 0, 60, 60, 0).execute(driverManager.getCurrentPlotter());
	}
}