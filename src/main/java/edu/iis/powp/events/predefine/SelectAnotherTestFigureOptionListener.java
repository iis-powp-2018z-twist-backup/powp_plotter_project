package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectAnotherTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectAnotherTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJoe.figureScript2(driverManager.getCurrentPlotter());
    }
}
