package controller.initializeSettings;

import java.awt.event.ActionEvent;
import java.io.IOException;

import view.InitializeSettings;

public class LoadAction extends SettingsAction {
	/**
	 *
	 */
	private static final long serialVersionUID = 2246123992595202578L;

	public LoadAction(InitializeSettings panel) {
		super(panel);
		putValue(NAME, "SwingAction");
		putValue(SHORT_DESCRIPTION, "Some short description");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			getModel().load();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}