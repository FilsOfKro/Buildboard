package controller.initializeSettings;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import model.settings.SettingsModel;
import view.InitializeSettings;

public abstract class SettingsAction extends AbstractAction {

	/**
	 *
	 */
	private static final long serialVersionUID = -3701215388656932513L;
	private InitializeSettings panel;
	private String path;
	private SettingsModel model;

	public SettingsAction(InitializeSettings panel) {
		this.panel = panel;
		this.model = new SettingsModel();
	}

	public void setPath(String path) {
		panel.getTfPathToSettings().setText(path);
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public InitializeSettings getPanel() {
		return panel;
	}

	public void setPanel(InitializeSettings panel) {
		this.panel = panel;
	}

	public SettingsModel getModel() {
		return model;
	}

	public void setModel(SettingsModel model) {
		this.model = model;
	}

	@Override
	public abstract void actionPerformed(ActionEvent e);
}
