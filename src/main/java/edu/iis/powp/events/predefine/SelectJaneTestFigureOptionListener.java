package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.powp.adapter.AbstractPlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectJaneTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectJaneTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AbstractPlotterAdapter plotterAdapter = new AbstractPlotterAdapter(driverManager.getCurrentPlotter());
		FiguresJane.figureScript(plotterAdapter);
	}
}