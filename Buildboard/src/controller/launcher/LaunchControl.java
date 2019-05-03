package controller.launcher;

import java.awt.EventQueue;

import org.apache.log4j.Logger;

import view.BuildBoard;

public class LaunchControl {
	// Logger de la classe
	private static Logger log = Logger.getLogger(LaunchControl.class.getName());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("log4j2.properties");
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					BuildBoard window = new BuildBoard();
					window.setVisible();
					window.startPage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
