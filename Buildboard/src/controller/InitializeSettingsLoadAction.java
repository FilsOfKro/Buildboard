package controller;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JTable;

import model.settings.SettingsModel;
import view.InitializeSettings;

public class InitializeSettingsLoadAction extends AbstractAction {
	/**
	 *
	 */
	private static final long serialVersionUID = 2246123992595202578L;
	private InitializeSettings panel;

	public InitializeSettingsLoadAction(InitializeSettings panel) {
		putValue(NAME, "SwingAction");
		putValue(SHORT_DESCRIPTION, "Some short description");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			JTable table = panel.getTable();
			String path = panel.getTfPathToSettings().getText();

			table.setModel(new SettingsModel(path));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}