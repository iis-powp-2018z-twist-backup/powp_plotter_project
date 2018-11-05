package edu.iis.powp.features;

import edu.iis.powp.app.Application;
import edu.iis.powp.events.predefine.SelectClearPanelOptionListener;
import edu.iis.powp.events.predefine.SelectSetLineStyleListener;
import edu.kis.powp.drawer.panel.DrawPanelController;

public class DrawerFeature {
	
	private static byte lineStyleId = 0; 
	
	private static DrawPanelController drawerController;

	/**
	 * Setup Drawer Plugin and add to application.
	 * 
	 * @param application
	 *            Application context.
	 */
	public static void setupDrawerPlugin(Application application) {
		SelectClearPanelOptionListener selectClearPanelOptionListener = new SelectClearPanelOptionListener();
		SelectSetLineStyleListener  selectSetLineStyleListener = new SelectSetLineStyleListener();
		drawerController = new DrawPanelController();
		application.addComponentMenu(DrawPanelController.class, "Draw Panel", 0);
		application.addComponentMenuElement(DrawPanelController.class, "Clear Panel", selectClearPanelOptionListener);
		application.addComponentMenuElement(DrawPanelController.class, "Set normal line", selectSetLineStyleListener);
		application.addComponentMenuElement(DrawPanelController.class, "Set dotted line", selectSetLineStyleListener);
		application.addComponentMenuElement(DrawPanelController.class, "Set special line", selectSetLineStyleListener);

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
	
	public static void setLineStyle(byte lineStyle) {
		lineStyleId = lineStyle;
	}
	
	public static byte getLineStyle() {
		return lineStyleId;
	}
}
