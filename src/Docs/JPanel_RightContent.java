package Docs;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JPanel_RightContent  extends JPanel{
	private JButton btnAccept;
	
	public JPanel_RightContent() {
		initComponents();
		addEvents();
	}
	
	
	public void initComponents() {
		setLayout(null);
		setBounds(0, 37, 830, 463);
		
		JPanel panel = new JPanel();
		panel.setBounds(102, 59, 520, 251);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 142, 53);
		panel.add(lblNewLabel);
		
		btnAccept = new JButton("New button");
		btnAccept.setBounds(212, 84, 89, 23);
		panel.add(btnAccept);
		
	}
	
	public void addEvents() {
		
	}
}
