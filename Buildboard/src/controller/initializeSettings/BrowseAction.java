package controller.initializeSettings;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFileChooser;

import view.InitializeSettings;

public class BrowseAction extends SettingsAction {
	/**
	 *
	 */
	private static final long serialVersionUID = 2246123992595202578L;
	private InitializeSettings panel;

	public BrowseAction(InitializeSettings panel) {
		super(panel);

		putValue(NAME, "SwingAction");
		putValue(SHORT_DESCRIPTION, "Some short description");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showOpenDialog(panel);
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
			setPath(selectedFile.getAbsolutePath());
		}
	}
}