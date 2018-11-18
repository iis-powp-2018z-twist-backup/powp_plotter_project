package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.DriverManager;

import java.awt.event.ActionEvent;

public class SelectAnotherTestFigureOptionListener extends AbstractActionListener {

    public SelectAnotherTestFigureOptionListener(DriverManager driverManager) {
        super(driverManager);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJoe.figureScript2(driverManager.getCurrentPlotter());
    }
}
