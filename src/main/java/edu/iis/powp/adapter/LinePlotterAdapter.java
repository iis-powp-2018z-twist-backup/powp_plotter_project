package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.features.DrawerFeature;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter implements IPlotter {

    private int startX = 0, startY = 0;
    private ILine line;

    public LinePlotterAdapter() {
        super();
        this.line = LineFactory.getBasicLine();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        this.setPosition(x, y);
        DrawerFeature.getDrawerController().drawLine(line);
    }

    public ILine getLine() {
        return line;
    }

    public void setLine(ILine line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "LineAdapter";
    }
}
