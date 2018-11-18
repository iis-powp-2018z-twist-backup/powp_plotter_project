package edu.iis.powp.events.predefine;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener2 implements ActionListener{


		private DriverManager driverManager;

		public SelectTestFigureOptionListener2(DriverManager driverManager) {
			this.driverManager = driverManager;
		}

		public void actionPerformed(ActionEvent e) {
			FiguresJoe.figureScript2(driverManager.getCurrentPlotter());
		}
	}


