import java.sql.*;  
	class mssqlcon{  
		public static void main(String args[]){  
			try{  
			Class.forName("com.mysql.cj.jdbc.Driver"); // step 1 
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/employee_db","root","abc456");	// step 2  
			 
			Statement stmt=con.createStatement();  // step 3
			ResultSet rs=stmt.executeQuery("select * from employee");	// step 4 
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  // step 5
			}catch(Exception e){ System.out.println(e);}  
			}  
	}
