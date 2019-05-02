package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.BuildBoard;

public class Launcher {

	private JFrame frmBuildboard;
	private JTable table;

	/**
	 * Create the application.
	 */
	public Launcher() {
		initialize();
		BuildBoard.init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBuildboard = new JFrame();
		frmBuildboard.setTitle("Buildboard");
		frmBuildboard.setIconImage(Toolkit.getDefaultToolkit().getImage(Launcher.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Bullets-Black.png")));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frmBuildboard.setSize(screenSize.width, screenSize.height);
		frmBuildboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frmBuildboard.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);

		JMenuItem mntmConfiguration = new JMenuItem("Configuration");
		mnFile.add(mntmConfiguration);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmHelp = new JMenuItem("Help");
		mnHelp.add(mntmHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		frmBuildboard.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel editionPanel = new JPanel();
		frmBuildboard.getContentPane().add(editionPanel, BorderLayout.CENTER);

		JLabel lblTable = new JLabel("Table :");
		editionPanel.add(lblTable, "cell 0 0,alignx trailing");

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null},
					{null, null, null},
				},
				new String[] {
						"New column", "New column", "New column"
				}
				));
		table.setCellSelectionEnabled(true);
		editionPanel.add(table, "cell 0 1 2 1,grow");

		JComboBox comboBox = new JComboBox();
		editionPanel.add(comboBox, "cell 1 0,alignx right,aligny top");

		JLabel lblNewLabel = new JLabel("New label");
		frmBuildboard.getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
	}

	public void setVisible() {
		frmBuildboard.setVisible(true);
	}
}
