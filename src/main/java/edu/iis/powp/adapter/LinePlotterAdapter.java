package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.features.DrawerFeature;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

/**
 * Plotter adapter to drawer with several bugs.
 */
public class LinePlotterAdapter implements IPlotter {
	private int startX = 0, startY = 0;
	private ILine line;
	private DrawPanelController drawer;

	public LinePlotterAdapter(ILine line, DrawPanelController drawer) {
		this.line = line;
		this.drawer = drawer;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void drawTo(int x, int y) {

		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		setPosition(x,y);
		drawer.drawLine(line);
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
