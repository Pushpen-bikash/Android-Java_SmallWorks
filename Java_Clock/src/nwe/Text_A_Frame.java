package nwe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Text_A_Frame extends JFrame {

	public JTextArea j1;
	public JButton b1;
	
	public Text_A_Frame()
	{
		setLayout(new FlowLayout(200));
		String s="Hi buddy";
		
		b1=new JButton("Start");
		add(b1);
		
		j1=new JTextArea(s,200,200);
		add(j1);
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new Worker().execute();
				
			}
		});
	}
}
