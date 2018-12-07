package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.factory.RectangleFactory;

public class SelectComplexCommandOptionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		if (command.equals("Rectangle"))
			new RectangleFactory(50,50);

	}

}