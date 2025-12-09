package miniProject;
import java.awt.FlowLayout;
import java.sql.*;

import javax.swing.*;
import javax.swing.JFrame;
class StudView  extends JFrame
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	
	StudView()
	{
		setLayout(new FlowLayout());
		
		l1=new JLabel("Rollno");
		l2=new JLabel("Name");
		l3=new JLabel("City");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		
		b1=new JButton("Add");
		b2=new JButton("Update");
		b3=new JButton("Delete");
		b4=new JButton("Search");
	
		b1.addActionListener(new StudController(this));
		b2.addActionListener(new StudController(this));
		b3.addActionListener(new StudController(this));
		b4.addActionListener(new StudController(this));
		
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);
		add(b1);add(b2);add(b3);add(b4);
		
		setVisible(true);
		setSize(400,400);
	}
}




