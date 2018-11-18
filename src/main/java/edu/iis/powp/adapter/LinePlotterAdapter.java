package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class LinePlotterAdapter implements IPlotter {
	
	
	private DrawPanelController drawerController;
	private ILine line;
	private int startX;
	private int startY;


	public LinePlotterAdapter(DrawPanelController drawerController, ILine line) {
		super();
		this.setDrawerController(drawerController);
		this.line = line;
	}



	@Override
	public void drawTo(int x, int y) {
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

	}



	@Override
	public void setPosition(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}



	public DrawPanelController getDrawerController() {
		return drawerController;
	}



	public void setDrawerController(DrawPanelController drawerController) {
		this.drawerController = drawerController;
	}



}
