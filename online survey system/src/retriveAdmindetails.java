

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/viewadmincode")
public class retriveAdmindetails extends HttpServlet {
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();		
		
	    
	
	try {
		Connection con=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
	
		PreparedStatement psmt=con.prepareStatement("select * from admin");
	    ResultSet rs=psmt.executeQuery();
	    out.println(" <center><a  href='control.html'>HOME</a></center>");
	    out.println("<center><h1>View employee record</h1></center><br>");
	    
	    out.println("<table align=center border='2'>");
	    out.println("<tr bgcolor=lightyellow>");
	    out.println("<td>ADMIN-CODE</td>");
	    out.println("</tr>");
	    while(rs.next())
	    {
	    	out.println("<tr>");
	    	out.println("<td>"+rs.getString(1)+"</td>");
	    	
	    	out.println("<tr>");
	    }
	    out.println("</table>");
		
	}
	catch(Exception e) {
		out.println(e);
	}
	}
	

}
