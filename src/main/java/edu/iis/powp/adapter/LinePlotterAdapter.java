package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class LinePlotterAdapter implements IPlotter {

	private DrawPanelController drawerController;
	private ILine line;

	public LinePlotterAdapter(DrawPanelController drawerController, ILine line) {
		super();
		this.drawerController = drawerController;
		this.line = line;
	}

	private int startX = 0, startY = 0;

	@Override
	public void drawTo(int x, int y) {
//		ILine line = LineFactory.getSpecialLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		drawerController.drawLine(line);
		this.setPosition(x, y);

	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;

	}

}
