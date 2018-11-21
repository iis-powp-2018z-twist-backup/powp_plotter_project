package edu.iis.powp.events.predefine;

import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestRectangleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestRectangleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandFactory.drawRectangle(-60, -60, 70, 110).execute(driverManager.getCurrentPlotter());
    }
}
