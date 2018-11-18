package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.powp.features.DrawerFeature;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter extends AbstractPlotter {

    protected ILine line;

    public LinePlotterAdapter() {
        super(0, 0);
        this.line = LineFactory.getBasicLine();
    }

    @Override
    public void drawTo(int x, int y) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(x, y);
        setPosition(x, y);
        DrawerFeature.getDrawerController().drawLine(line);
    }

    @Override
    public String toString() {
        return "Plotter Adapter";
    }

    public ILine getLine() {
        return line;
    }

    public void setLine(ILine line) {
        this.line = line;
    }
}
