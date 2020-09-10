package employeerecords;

import java.sql.*;

public class WriteToDb extends MainClass{
	
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/employee";
	static final String USER = "root";
	static final String PASS = "root";
    public static void writeToDb(NewPojo emp)
	{
    	m.put(id, emp);
    id =	emp.setId(id);
    System.out.println("Id" + id);
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			System.out.println("Inserting records into the table...");
			stmt = conn.createStatement();
			
        
			String sql = "INSERT INTO emp " +
					"VALUES (id, name, department, designation ,salary)";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			System.out.println(stmt);
			System.out.println("Inserted records into the table...");

		}catch(SQLException se){

			se.printStackTrace();
		}catch(Exception e){

			e.printStackTrace();
		}finally{

			try{
				if(stmt!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		
	}
}

