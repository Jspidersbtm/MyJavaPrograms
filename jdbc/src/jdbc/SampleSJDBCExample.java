package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleSJDBCExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.driver.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1501:orcl", "scott", "tiger");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into mr.student values('10','aLPHA')");
		con.close();
		System.out.println("Successful");
	}
}
