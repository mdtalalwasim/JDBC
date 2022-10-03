import java.sql.*;
import java.io.*;

class ImageInsert{
	public static void main(String[] args) {
		
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/youtube";
			String name = "root";
			String password = "wasim";
			Connection con = DriverManager.getConnection(url,name,password);

			//creating query for fireing...
			String q = "insert into images(pic) values(?)"; //id auto increment so no need to write id colum...
			PreparedStatement pstmt = con.prepareStatement(q);
			//pstmt.setString(1, "value");

			FileInputStream fis = new FileInputStream("img/img.jpg"); 
			pstmt.setBinaryStream(1, fis, fis.available()); //1 for the sequence of (?) parameter.

			pstmt.executeUpdate();
			System.out.println("Image Inserted Successfully..."); 

		}
		catch(Exception e){
			//e.printStackTrace();
			System.out.println("Error!");
		}

	}

}