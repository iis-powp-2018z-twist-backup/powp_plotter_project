package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Figure Joe 1" )
			FiguresJoe.figureScript1(driverManager.getCurrentPlotter());
		if(e.getActionCommand() == "Figure Joe 2" )
			FiguresJoe.figureScript2(driverManager.getCurrentPlotter());
	}
}
