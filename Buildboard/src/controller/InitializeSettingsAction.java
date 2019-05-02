package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class InitializeSettingsAction extends AbstractAction {
	/**
	 *
	 */
	private static final long serialVersionUID = 2246123992595202578L;
	public InitializeSettingsAction() {
		putValue(NAME, "SwingAction");
		putValue(SHORT_DESCRIPTION, "Some short description");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	}
}