package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;

public class CommandDrawLineToPosition implements PlotterCommand  {

	
	private int x = 0, y = 0;
    public CommandDrawLineToPosition(int x, int y) {
       this.x = x;
       this.y = y;
   }
    public CommandDrawLineToPosition(DrawPanelController drawerController) {
		// TODO Auto-generated constructor stub
	}
	@Override public void execute(IPlotter iPlotter) {
       iPlotter.drawTo(x, y);
    }


	
}
