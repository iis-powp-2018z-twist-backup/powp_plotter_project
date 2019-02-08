package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTriangleTestFigureListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTriangleTestFigureListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		CommandFactory.drawTriangle(10,10,40,40,10,40).execute(driverManager.getCurrentPlotter());
	}
}
