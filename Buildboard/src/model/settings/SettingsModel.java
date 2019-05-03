package model.settings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

public class SettingsModel extends DefaultTableModel {
	// Logger de la classe
	private static Logger log = Logger.getLogger(SettingsModel.class.getName());

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
		log.debug("Start setPath(String)");
		log.debug("Parameter path : " + path);

		this.path = path;

		log.debug("Stop setPath(String)");
	}

	public void load() throws FileNotFoundException, IOException {
		log.debug("Start load()");

		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);

		log.debug("Stop load()");
	}

	public void write() {
		log.debug("Start write()");

		log.debug("Stop write()");
	}

}
