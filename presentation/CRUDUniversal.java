package presentation;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;

public class CRUDUniversal extends JPanel {
	private JLabel lblPene;
	private JScrollPane scrollPane;
	private JList list;

	/**
	 * Create the panel.
	 */
	public CRUDUniversal() {
		
		scrollPane = new JScrollPane();
		add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		


	}

}
