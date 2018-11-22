package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter implements IPlotter {
	
	

	private int startX;
	private int startY;
	private DrawPanelController drawPanelController;
	
	public LinePlotterAdapter(DrawPanelController drawPanelController) {
		this.drawPanelController =drawPanelController;
	}
	

	@Override
	public void drawTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		this.setPosition(x, y);
		drawPanelController.drawLine(line);
		
	}

	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}
		

	public void setDrawPanelController(DrawPanelController drawPanelController) {
		this.drawPanelController = drawPanelController;
	}

}
