package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.features.DrawerFeature;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

/**
 * Plotter adapter to drawer with several bugs.
 */
public class MyAdapter extends DrawPanelController implements IPlotter {
	
	
	DrawPanelController drawerController = DrawerFeature.getDrawerController();
	
	
	private int startX = 0, startY = 0;

	public MyAdapter() {
		super();
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

		drawerController.drawLine(line);
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
