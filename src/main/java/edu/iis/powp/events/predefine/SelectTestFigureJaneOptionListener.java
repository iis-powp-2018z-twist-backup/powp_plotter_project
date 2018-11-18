package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.powp.adapter.JaneFigureAdapter;
import edu.iis.powp.app.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureJaneOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureJaneOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(new JaneFigureAdapter(driverManager.getCurrentPlotter()));
    }
}
