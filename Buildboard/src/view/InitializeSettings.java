package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.InitializeSettingsAction;

public class InitializeSettings extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = -3700541605597287854L;
	private JTextField tfPathToSettings;
	private JTable table;
	private final InitializeSettingsAction loadAction = new InitializeSettingsAction();

	/**
	 * Create the panel.
	 */
	public InitializeSettings() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblChargerUnFichier = new JLabel("Charger un fichier");
		GridBagConstraints gbc_lblChargerUnFichier = new GridBagConstraints();
		gbc_lblChargerUnFichier.insets = new Insets(0, 0, 5, 5);
		gbc_lblChargerUnFichier.anchor = GridBagConstraints.EAST;
		gbc_lblChargerUnFichier.gridx = 0;
		gbc_lblChargerUnFichier.gridy = 0;
		add(lblChargerUnFichier, gbc_lblChargerUnFichier);

		tfPathToSettings = new JTextField();
		GridBagConstraints gbc_tfPathToSettings = new GridBagConstraints();
		gbc_tfPathToSettings.insets = new Insets(0, 0, 5, 5);
		gbc_tfPathToSettings.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPathToSettings.gridx = 1;
		gbc_tfPathToSettings.gridy = 0;
		add(tfPathToSettings, gbc_tfPathToSettings);
		tfPathToSettings.setColumns(10);

		JButton btnBrowse = new JButton("Parcourir...");
		GridBagConstraints gbc_btnBrowse = new GridBagConstraints();
		gbc_btnBrowse.insets = new Insets(0, 0, 5, 0);
		gbc_btnBrowse.gridx = 2;
		gbc_btnBrowse.gridy = 0;
		add(btnBrowse, gbc_btnBrowse);

		JButton btnLoadProperties = new JButton("Charger les propriétés");
		btnLoadProperties.setAction(loadAction);
		GridBagConstraints gbc_btnLoadProperties = new GridBagConstraints();
		gbc_btnLoadProperties.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoadProperties.gridx = 1;
		gbc_btnLoadProperties.gridy = 1;
		add(btnLoadProperties, gbc_btnLoadProperties);

		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 3;
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 2;
		add(table, gbc_table);

	}
}
