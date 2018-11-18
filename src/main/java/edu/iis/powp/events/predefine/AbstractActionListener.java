package edu.iis.powp.events.predefine;

import edu.iis.powp.app.DriverManager;

import java.awt.event.ActionListener;

public abstract class AbstractActionListener implements ActionListener {

    DriverManager driverManager;

    AbstractActionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }
}
