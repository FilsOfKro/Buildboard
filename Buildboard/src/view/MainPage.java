package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainPage extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainPage() {

		JLabel lblTable = new JLabel("Table :");
		add(lblTable, "cell 0 0,alignx trailing");

		JTable table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, { null, null, null }, },
				new String[] { "New column", "New column", "New column" }));
		table.setCellSelectionEnabled(true);
		add(table, "cell 0 1 2 1,grow");

		JComboBox comboBox = new JComboBox();
		add(comboBox, "cell 1 0,alignx right,aligny top");
	}

}
