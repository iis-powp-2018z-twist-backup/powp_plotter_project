package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.app.DriverManager;
import edu.kis.powp.drawer.shape.ILine;

import java.awt.event.ActionEvent;

public class SelectLineListener extends AbstractActionListener {

    private ILine line;

    public SelectLineListener(DriverManager driverManager, ILine line) {
        super(driverManager);
        this.line = line;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        IPlotter plotter = driverManager.getCurrentPlotter();
        //todo tu musi zostać instanceof ponieważ nie mogę zmienić interface tak aby dodać metodę setLine
        //natomiast teraz LinePlotter jest podstawowoym plotterem i jego rozszerzenie gwarantuje że tutaj kolejnego ifa
        //nie trzeba będzie dopisać
        if (plotter instanceof LinePlotterAdapter) {
            ((LinePlotterAdapter) plotter).setLine(this.line);
        }
    }
}
