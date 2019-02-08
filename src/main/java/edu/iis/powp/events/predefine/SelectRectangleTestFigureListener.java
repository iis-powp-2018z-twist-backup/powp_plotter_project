package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRectangleTestFigureListener implements ActionListener {

	private DriverManager driverManager;

	public SelectRectangleTestFigureListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		CommandFactory.drawRectangle(20,20,100,50).execute(driverManager.getCurrentPlotter());
	}
}
