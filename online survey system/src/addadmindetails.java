

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/addadmindetails")
public class addadmindetails extends HttpServlet {
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String username=req.getParameter("adminid");
		
		
		
	    
	
	try {
		Connection con=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
		PreparedStatement psmt=con.prepareStatement("insert into admin values(?)");
		psmt.setString(1,username);
	
		
		int n=psmt.executeUpdate();
		
		if(n>0) {
			 RequestDispatcher rd=req.getRequestDispatcher("control.html");
			 rd.forward(req, res);
		}
		else {
			out.println("not entered");
		}
	}
	catch(Exception e) {
		out.println(e);
	}
	}
	

}
