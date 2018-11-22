/**
 *
 */
package model;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.hraccess.openhr.IHRDataSection;

import model.exceptions.FormatException;

/**
 * The Class Bordereau.
 *
 * @author owenn.pantry
 */
public class Bordereau {
	
	/** The log. */
	private static Logger log = Logger.getLogger("Bordereau");
	
	/** The table. */
	String table;
	
	/** The donnees. */
	ArrayList donnees;

	/**
	 * Instantiates a new bordereau.
	 *
	 * @param table the table
	 */
	public Bordereau(String table) {
		this.table = table;

		List<IHRDataSection> dataSections = Server.getInstance().loadDictionnary(table);
		for (IHRDataSection ihrDataSection : dataSections) {
			System.out.println(ihrDataSection.getLabel() + " : " + ihrDataSection.getType() + " : "
					+ ihrDataSection.getReadBufferLength());
		}
	}

	/**
	 * Adds the data.
	 *
	 * @param data the data
	 * @throws FormatException the format exception
	 */
	public void addData(Object data) throws FormatException {
		// checkFormat(data);
	}

}
