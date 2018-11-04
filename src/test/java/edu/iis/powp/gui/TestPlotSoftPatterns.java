package edu.iis.powp.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iis.client.plottermagic.ClientPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.DrawingLinePlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.events.predefine.SelectTestFigureOptionOneListener;
import edu.iis.powp.events.predefine.SelectTestFigureOptionTwoListener;
import edu.iis.powp.features.DrawerFeature;
import edu.kis.powp.drawer.shape.LineFactory;

public class TestPlotSoftPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup tests concerning preset figures in context.
	 * 
	 * @param application
	 *            Application context.
	 */
	private static void setupPresetTests(Application application) {
		SelectTestFigureOptionOneListener selectTestFigureOptionOneListener = new SelectTestFigureOptionOneListener(
				application.getDriverManager());
		SelectTestFigureOptionTwoListener selectTestFigureOptionTwoListener = new SelectTestFigureOptionTwoListener(
				application.getDriverManager());

		application.addTest("Figure Joe 1", selectTestFigureOptionOneListener);
		application.addTest("Figure Joe 2", selectTestFigureOptionTwoListener);
	}

	/**
	 * Setup driver manager, and set default IPlotter for application.
	 * 
	 * @param application
	 *            Application context.
	 */
	private static void setupDrivers(Application application) {
		IPlotter clientPlotter = new ClientPlotter();
		application.addDriver("Client Plotter", clientPlotter);
		application.getDriverManager().setCurrentPlotter(clientPlotter);

		IPlotter basicPlotter = new DrawingLinePlotterAdapter(DrawerFeature.getDrawerController(), LineFactory.getBasicLine());
		application.addDriver("Basic Line Simulator", basicPlotter);
		IPlotter dottedPlotter = new DrawingLinePlotterAdapter(DrawerFeature.getDrawerController(), LineFactory.getDottedLine());
		application.addDriver("Dotted Line Simulator", dottedPlotter);
		IPlotter specialPlotter = new DrawingLinePlotterAdapter(DrawerFeature.getDrawerController(), LineFactory.getSpecialLine());
		application.addDriver("Special Line Simulator", specialPlotter);

		application.updateDriverInfo();
	}

	/**
	 * Setup menu for adjusting logging settings.
	 * 
	 * @param application
	 *            Application context.
	 */
	private static void setupLogger(Application application) {
		application.addComponentMenu(Logger.class, "Logger", 0);
		application.addComponentMenuElement(Logger.class, "Clear log",
				(ActionEvent e) -> application.flushLoggerOutput());
		application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
		application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
		application.addComponentMenuElement(Logger.class, "Warning level",
				(ActionEvent e) -> logger.setLevel(Level.WARNING));
		application.addComponentMenuElement(Logger.class, "Severe level",
				(ActionEvent e) -> logger.setLevel(Level.SEVERE));
		application.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> logger.setLevel(Level.OFF));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Application app = new Application();
				DrawerFeature.setupDrawerPlugin(app);

				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);

				app.setVisibility(true);
			}
		});
	}

}
