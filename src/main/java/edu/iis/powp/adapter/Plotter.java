package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class Plotter implements IPlotter {

	private DrawPanelController drawerController;

	private int startX = 0, startY = 0;

	public Plotter(DrawPanelController drawerController) {
		this.drawerController = drawerController;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void drawTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		this.setPosition(x, y);
		drawerController.drawLine(line);
	}

	@Override
	public String toString() {
		return "This is plotter";
	}
}
