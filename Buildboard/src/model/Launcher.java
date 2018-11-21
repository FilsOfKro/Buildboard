/**
 *
 */
package model;

/**
 * @author owenn.pantry
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getenv("APPDATA");
		Server.getInstance().refreshDictionary();
	}

}
