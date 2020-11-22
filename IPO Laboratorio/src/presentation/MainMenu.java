package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import java.awt.Dimension;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JTree tree;
	private JPanel panelCard;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setBounds(new Rectangle(0, 0, 1100, 900));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(200, 23));
		splitPane.setLeftComponent(scrollPane);
		
		tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("MainMenu") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Gestionar reservas");
						node_1.add(new DefaultMutableTreeNode("Parcelas"));
						node_1.add(new DefaultMutableTreeNode("Bungalows"));
					add(node_1);
					add(new DefaultMutableTreeNode("Gestionar actividades"));
					add(new DefaultMutableTreeNode("Gestionar empleados"));
					node_1 = new DefaultMutableTreeNode("Gestionar rutas");
						node_1.add(new DefaultMutableTreeNode("Rutas disponibles"));
						node_1.add(new DefaultMutableTreeNode("Diseñar rutas"));
					add(node_1);
				}
			}
		));
		scrollPane.setViewportView(tree);
		
		panelCard = new JPanel();
		splitPane.setRightComponent(panelCard);
		
		panel_1 = new CRUDUniversal();
		
		panelCard.add(panel_1);
		
		panel_2 = new JPanel();
		panelCard.add(panel_2);
		
		panel_3 = new JPanel();
		panelCard.add(panel_3);
		
		panel_4 = new JPanel();
		panelCard.add(panel_4);
	}

}
