/**
 *
 */
package model;

/**
 * @author owenn.pantry
 *
 */
public class BuildBoard {

	/**
	 * @param args
	 */
	public static void init() {
		// TODO Auto-generated method stub
		System.getenv("APPDATA");
		Server.getInstance().refreshDictionary();
	}

}
