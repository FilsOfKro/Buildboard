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
 * @author owenn.pantry
 *
 */
public class Bordereau {
	private static Logger log = Logger.getLogger("Bordereau");
	String table;
	ArrayList donnees;

	public Bordereau(String table) {
		this.table = table;

		List<IHRDataSection> dataSections = Server.getInstance().loadDictionnary(table);
		for (IHRDataSection ihrDataSection : dataSections) {
			System.out.println(ihrDataSection.getLabel() + " : " + ihrDataSection.getType() + " : "
					+ ihrDataSection.getReadBufferLength());
		}
	}

	public void addData(Object data) throws FormatException {
		// checkFormat(data);
	}

}
