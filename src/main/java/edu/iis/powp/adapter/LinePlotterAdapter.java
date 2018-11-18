package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter extends DrawPanelController implements IPlotter{
	
	DrawPanelController drawerController;
	private int startX = 0, startY = 0;
	
	public LinePlotterAdapter() {
		super();
	}
	
	public LinePlotterAdapter(DrawPanelController drawerController) {
		super();
		this.drawerController = drawerController;

	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void drawTo(int x, int y) {
		// TODO Auto-generated method stub
		ILine line = LineFactory.getSpecialLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		
		drawerController.drawLine(line);
		this.setPosition(x, y);
	}

}
