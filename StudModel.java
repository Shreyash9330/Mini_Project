package miniProject;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class StudModel {
public MyConnection mycon;
	
public void addStudent(Student s)
{
	try 
	{
			 mycon = new MyConnection();
			 PreparedStatement pst =mycon.con.prepareStatement("insert into student  values(?,?,?)");
			 pst.setInt(1,s.getRno());
			 pst.setString(2,s.getName());
			 pst.setString(3,s.getCity());
			 pst.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Record Saved");
			 mycon.con.close();
			
	}
	catch(Exception ex)
	{
			System.out.print(ex);
	}
}
	
public void updateStudent(Student s)
{
	try
		{
			mycon=new MyConnection();
			PreparedStatement pst=mycon.con.prepareStatement("update student set name=?,city=? where rno=?");
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			pst.setInt(3, s.getRno());
			pst.executeUpdate();
			mycon.con.close();
			JOptionPane.showMessageDialog(null,"RECORD UPDATED");
		}
		catch(Exception ex) {}
		
}
	
public void deleteStudent(Student s)
{
	try
		{
			mycon=new MyConnection();
			PreparedStatement pst=mycon.con.prepareStatement("delete from student where rno=?");
			pst.setInt(1, s.getRno());
			pst.executeUpdate();
			mycon.con.close();
			JOptionPane.showMessageDialog(null,"RECORD DELETED");
		}
		catch(Exception ex) 
		{
			System.out.println(ex);
		}
}
	
public void searchStudent(Student s)
{
		try
		{
			mycon=new MyConnection();
			PreparedStatement pst=mycon.con.prepareStatement("select * from student where rno=?");
			pst.setInt(1, s.getRno());
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				s.setName(rs.getString(2));
				s.setCity(rs.getString(3));
			}
			else
				JOptionPane.showMessageDialog(null,"NOT FOUND");
			
			mycon.con.close();
		}
		catch(Exception ex) 
		{
			System.out.println(ex);
		}
}



