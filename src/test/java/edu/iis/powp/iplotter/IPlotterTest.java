package edu.iis.powp.iplotter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJoe;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class IPlotterTest {
	private static IPlotter plotter = new TestPlotter();

	/**
	 * Plotter test.
	 */
	public static void main(String[] args) {
		System.out.println("figureScript1");
		FiguresJoe.figureScript1(plotter);
		System.out.println("\nfigureScript2");
		FiguresJoe.figureScript2(plotter);
	}

	private static class TestPlotter implements IPlotter {

		@Override
		public void drawTo(int x, int y) {
			System.out.println("Plotter drawTo action \t\tx:" + x + "\ty:" + y);
		}

		@Override
		public void setPosition(int x, int y) {
			System.out.println("Plotter setPosition action \tx:" + x + "\ty:" + y);
		}
	};
}
