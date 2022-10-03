import java.util.*;
import java.sql.*;



class InsertJDBC{
	public static void main(String[] args) {
		
		try{

					//load the class

		Class.forName("com.mysql.cj.jdbc.Driver");

		//create a connection

		String url = "jdbc:mysql://localhost:3306/youtube";
		String uname = "root";
		String password = "wasim";


		Connection con = DriverManager.getConnection(url,uname,password);

		//creating a query...

		String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";


		//create STATEMENT for Above simple query...we need Statement obj...

		Statement stmt = con.createStatement();//statement objecte 

		stmt.executeUpdate(q); //otherwise stmt.executeQuery()
		//because its only create query.. not fetch any data from database
		//return int value
		System.out.println("Table Created...!");
		con.close();


		/*if (con.isClosed()) {
			System.out.println("Connection Closed");
		}
		else{
			System.out.println("Connection Created!");

		}
		*/


		}
		catch(Exception e){

			e.printStackTrace();

		}
	}
}