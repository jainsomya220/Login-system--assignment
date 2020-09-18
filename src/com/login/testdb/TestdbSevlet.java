package com.login.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestdbSevlet
 */
@WebServlet("/TestdbSevlet")
public class TestdbSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub 
		
		String user="hbstudent";
		String pass="hbstudent";
		
		String jdbcUrl="jdbc:mysql://localhost:3306/user_login_system?useSSL=false";
		String driver="com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out=response.getWriter();
			
			out.println("Connecting to database" + jdbcUrl);
			
			Class.forName(driver);
			
			Connection myconn=DriverManager.getConnection(jdbcUrl,user,pass);
			
			out.println("Successful");
			
			
			myconn.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new ServletException(ex);
		}
		
	}

}
