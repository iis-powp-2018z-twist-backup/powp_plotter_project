package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;

public class JaneFigureAdapter extends AbstractPlotter {
    private static final int START_X = 80;
    private static final int START_Y = 80;

    private IPlotter plotter;

    public JaneFigureAdapter(IPlotter plotter) {
        super(START_X, START_Y);
        this.plotter = plotter;
        plotter.setPosition(START_X, START_Y);
    }

    @Override
    public void drawTo(int x, int y) {
        plotter.drawTo(x, y);
    }
}
