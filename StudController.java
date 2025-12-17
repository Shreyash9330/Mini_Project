package miniProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class StudController implements ActionListener
{
	public StudView v;
	public Student s1;
	public StudModel m ;
	
	public StudController(StudView v)
	{
		s1= new Student();
		m = new StudModel();
		this.v=v;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==v.b1) 
		{
			if(v.t1.getText().isEmpty() || v.t2.getText().isEmpty() || v.t3.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Please Enter Details");
			}
			else
			{
			s1.setRno(Integer.parseInt(v.t1.getText()));
			s1.setName(v.t2.getText());
			s1.setCity(v.t3.getText());
			m.addStudent(s1);
			}
			
		}
		else if(e.getSource()==v.b2)
		{
			s1.setRno(Integer.parseInt(v.t1.getText()));
			s1.setName(v.t2.getText());
			s1.setCity(v.t3.getText());
			m.updateStudent(s1);
		}
		else if(e.getSource()==v.b3)
		{
			s1.setRno(Integer.parseInt(v.t1.getText()));
				m.deleteStudent(s1);
		}
		else if(e.getSource()==v.b4)
		{
			s1.setRno(Integer.parseInt(v.t1.getText()));
			m.searchStudent(s1);
			v.t2.setText(s1.getName());
			v.t3.setText(s1.getCity());
		}
	}
}


