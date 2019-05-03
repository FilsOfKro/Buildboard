package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class BuildBoard {

	private JFrame frmBuildboard;
	private JPanel editionPanel;

	/**
	 * Create the application.
	 */
	public BuildBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBuildboard = new JFrame();
		frmBuildboard.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(BuildBoard.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
		frmBuildboard.setTitle("Buildboard");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frmBuildboard.setSize(screenSize.width / 2, screenSize.height / 2);

		frmBuildboard.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

		editionPanel = new JPanel();
		frmBuildboard.getContentPane().add(editionPanel, BorderLayout.CENTER);
		GridBagLayout gbl_editionPanel = new GridBagLayout();
		gbl_editionPanel.columnWidths = new int[] { 0 };
		gbl_editionPanel.rowHeights = new int[] { 0 };
		gbl_editionPanel.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_editionPanel.rowWeights = new double[] { Double.MIN_VALUE };
		editionPanel.setLayout(gbl_editionPanel);


		JPanel statusPanel = new JPanel();
		statusPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmBuildboard.getContentPane().add(statusPanel, BorderLayout.SOUTH);
		GridBagLayout gbl_statusPanel = new GridBagLayout();
		gbl_statusPanel.columnWidths = new int[] { 929, 46, 0 };
		gbl_statusPanel.rowHeights = new int[] { 14, 0 };
		gbl_statusPanel.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_statusPanel.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		statusPanel.setLayout(gbl_statusPanel);

		JLabel StatusLabel = new JLabel("New label");
		StatusLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_StatusLabel = new GridBagConstraints();
		gbc_StatusLabel.insets = new Insets(0, 0, 0, 5);
		gbc_StatusLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_StatusLabel.gridx = 0;
		gbc_StatusLabel.gridy = 0;
		statusPanel.add(StatusLabel, gbc_StatusLabel);
	}

	public void setVisible() {
		frmBuildboard.setVisible(true);
	}

	public void startPage() {
		editionPanel.add(new InitializeSettings());
	}
}
