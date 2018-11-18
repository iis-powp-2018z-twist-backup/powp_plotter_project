package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

/**
 * Plotter adapter to drawer with several bugs.///
 */
public class MyAdapter implements IPlotter {
	//UWAGA MyAdapter dziedziczy z DrawPanelController sprawdzić to !!!!!!!!!!!!!!
	// DrawPanelController powinien być atrybutem klasy
	
	// w rysowaniu powinna wjść skrzynia - drawTo nie zmienia współrzędnych X i Y a powinien

	
	private int startX = 0, startY = 0;
	private DrawPanelController drawPanelController;



	public MyAdapter(DrawPanelController drawPanelController) {
		this.drawPanelController = drawPanelController;
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
		drawPanelController.drawLine(line);
		
		//DrawerFeature.getDrawerController().drawLine(line);
	}

	@Override
	public String toString() {
		return "Figure";
	}



}
