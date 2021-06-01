

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
@WebServlet("/deleteadminbyid")
public class deleteadminbyid extends HttpServlet {
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();		
		
	    
	
	try {
		Connection con=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
	
		PreparedStatement psmt=con.prepareStatement("select * from admin");
	    ResultSet rs=psmt.executeQuery();
	    out.println(" <center><a  href='home.html'>HOME</a></center>");
	    out.println("<center><h1>delete admin record</h1></center><br>");
	    
	    out.println("<table align=center border='2' width=1200>");
	    out.println("<tr bgcolor=lightyellow>");
	    out.println("<td>ADMIN_CODE</td>");
	    out.println("<td>Action</td>");
	    out.println("</tr>");
	    while(rs.next())
	    {
	    	out.println("<tr>");
	    	out.println("<td>"+rs.getString(1)+"</td>");
	    	out.println("<td><a  href='adminbyid?id="+rs.getString(1)+"'>Delete</a></td>");
	    	out.println("<tr>");
	    }
	    out.println("</table>");
		
	}
	catch(Exception e) {
		out.println(e);
	}
	}
	

}
