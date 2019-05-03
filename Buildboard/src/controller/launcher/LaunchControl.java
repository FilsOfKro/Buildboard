package controller.launcher;

import java.awt.EventQueue;

import view.BuildBoard;

public class LaunchControl {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
