

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteemployeebyidServlet
 */
@WebServlet("/adminbyid")
public class deleteadmindetails extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String userid=req.getParameter("id");
		try {
			Connection con=null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driverclass loaded");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
			System.out.println("connectionesstblished");
			Statement stmt=con.createStatement();
			System.out.println(userid);
			int i=stmt.executeUpdate("delete from admin where admincode="+userid);
			System.out.println("executed");
		    if(i>0) {
				 res.sendRedirect("deleteadminbyid");
			}
			else {
				out.println("unable to delete employee record");
			}
		    
		    
			
		}
		catch(Exception e) {
			out.println(e);
		}
		
		
	}
	

}
