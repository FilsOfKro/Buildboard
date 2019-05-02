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

	public SettingsModel(String path) throws FileNotFoundException, IOException {
		super(new Object[][] { { null, null }, }, new String[] { "Key", "Value" });
		this.properties = new Properties();
		FileInputStream fis = new FileInputStream(path);

		properties.load(fis);
	}

	public void load() {


	}

	public void write() {

	}

}
