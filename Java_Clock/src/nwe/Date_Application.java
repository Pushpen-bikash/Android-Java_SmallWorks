package nwe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Date_Application extends JFrame{

	public JTextField j1;
	public JTextField j2;
	public JButton b1;
	
	public Date_Application()
	{
		setLayout(new FlowLayout());
		
		j1=new JTextField("dd/MM/yyyy");
		j1.setVisible(true);
		j1.setSize(70,70);
		add(j1);
		
		b1=new JButton("see");
		add(b1);
		
		j2=new JTextField("OutPut");
		j2.setSize(80, 80);
		j2.setVisible(true);
		add(j2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
                    
				  try {
					  String input_date=j1.getText();
			      	  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			      	  java.util.Date dt1=  format1.parse(input_date);
			      	  DateFormat format2=new SimpleDateFormat("EEEE"); 
			      	  String finalDay=format2.format(dt1);
			      	j2.setText(finalDay);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
	}
	
	
}
