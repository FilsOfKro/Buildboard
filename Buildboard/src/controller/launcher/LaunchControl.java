package controller.launcher;

import java.awt.EventQueue;

import view.Launcher;

public class LaunchControl {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Launcher window = new Launcher();
					window.setVisible();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
