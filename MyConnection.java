package miniProject;
import java.sql.*;
public class MyConnection {
	
		public Connection con;
	MyConnection()
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false", "root", "root@2002");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
