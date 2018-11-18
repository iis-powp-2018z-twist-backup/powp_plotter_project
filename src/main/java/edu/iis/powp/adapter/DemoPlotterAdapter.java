package edu.iis.powp.adapter;

import edu.iis.powp.features.DrawerFeature;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

/**
 * Plotter adapter to drawer with several bugs.
 */
public class DemoPlotterAdapter extends LinePlotterAdapter {

	public DemoPlotterAdapter() {
		super();
	}

	@Override
	public void drawTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.getX(), this.getY());
		line.setEndCoordinates(x, y);
		this.setPosition(x, y);
		DrawerFeature.getDrawerController().drawLine(line);
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
