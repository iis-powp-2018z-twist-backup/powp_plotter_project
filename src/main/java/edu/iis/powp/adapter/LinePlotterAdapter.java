package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

/**
 * Plotter adapter to drawer with several bugs.
 */
public class LinePlotterAdapter implements IPlotter {
	private int startX = 0, startY = 0;
    private DrawPanelController drawPanelController;
    private ILine line;

	public LinePlotterAdapter(DrawPanelController drawPanelController, ILine line){
    	this.drawPanelController = drawPanelController;
    	this.line = line;
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
        this.setPosition(x, y);
		drawPanelController.drawLine(line);

	}

	@Override
	public String toString() {
		return "Ploter Simulator";
	}
}
