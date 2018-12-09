package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.factory.Circle;
import edu.iis.powp.factory.Rectangle;
import edu.iis.powp.command.PlotterCommand;


public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Circle circle = new Circle(0,0,150);
		Rectangle rectangle = new Rectangle(0,0,400,300);

		switch (e.getActionCommand())
        {
		case "Figure Joe 1":
		FiguresJoe.figureScript1(driverManager.getCurrentPlotter());

        case "Figure Joe 2":
        FiguresJoe.figureScript2(driverManager.getCurrentPlotter());
        break;

        case "Rectangle":
        PlotterCommand rectangleCommand = rectangle.getRectangle();
        rectangleCommand.execute(driverManager.getCurrentPlotter());
        break;

        case "Circle":
        PlotterCommand circleCommand = circle.getCircle();
        circleCommand.execute(driverManager.getCurrentPlotter());
        break;
    }
	}
}
