//program for JDBC connection 1st program...
import java.sql.*;
import java.util.Properties;



class FirstJDBC{
		public static void main(String[] args) {
			
			try{

				 
				 //load the driver

				Class.forName("com.mysql.cj.jdbc.Driver");//Driver is : in this Package  :com.mysql.cj.jdbc.

				//create a connection

				String url= "jdbc:mysql://localhost:3306/youtube";//for mysql db...for oracle it will changed
				
				String username= "root";
				String password = "wasim";

				Connection con = DriverManager.getConnection(url,username,password);

				//test the connection

				if (con.isClosed()) {
					System.out.println("Connection is closed!");
				}

				else{
					System.out.println("Connection is created...!");

				}





 





			}catch(Exception e){
				e.printStackTrace();

			}













		}

}