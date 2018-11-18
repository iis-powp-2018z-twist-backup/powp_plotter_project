package edu.iis.powp.features;

import edu.iis.powp.app.Application;
import edu.iis.powp.events.predefine.SelectClearPanelOptionListener;
import edu.iis.powp.events.predefine.SelectLineListener;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.LineFactory;

public class DrawerFeature {

	private static DrawPanelController drawerController;

	/**
	 * Setup Drawer Plugin and add to application.
	 * 
	 * @param application
	 *            Application context.
	 */
	public static void setupDrawerPlugin(Application application) {
		SelectClearPanelOptionListener selectClearPanelOptionListener = new SelectClearPanelOptionListener();
		SelectLineListener dottedLine = new SelectLineListener(application.getDriverManager(), LineFactory.getDottedLine());
		SelectLineListener defaultLine = new SelectLineListener(application.getDriverManager(), LineFactory.getBasicLine());

		drawerController = new DrawPanelController();
		application.addComponentMenu(DrawPanelController.class, "Draw Panel", 0);
		application.addComponentMenuElement(DrawPanelController.class, "Clear Panel", selectClearPanelOptionListener);
		application.addComponentMenuElement(DrawPanelController.class, "Select dotted line", dottedLine);
		application.addComponentMenuElement(DrawPanelController.class, "Select solid line", defaultLine);

		drawerController.initialize(application.getFreePanel());
	}

	/**
	 * Get controller of application drawing panel.
	 * 
	 * @return drawPanelController.
	 */
	public static DrawPanelController getDrawerController() {
		return drawerController;
	}
}
