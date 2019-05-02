package model.settings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.table.DefaultTableModel;

public class SettingsModel extends DefaultTableModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1386234933304568214L;
	private Properties properties;
	private String path;

	public SettingsModel() {
		super(new Object[][] { { null, null }, }, new String[] { "Key", "Value" });
		this.properties = new Properties();
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void load() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
	}

	public void write() {

	}

}
