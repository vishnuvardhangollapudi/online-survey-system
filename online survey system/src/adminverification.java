import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/admin")
public class adminverification extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String adminid=req.getParameter("adminid");
		System.out.println(adminid);
		
		try {
			Connection con=null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver class loaded");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
			System.out.println("connect establisgedd");
			PreparedStatement psmt=con.prepareStatement("select * from admin");
		    ResultSet rs=psmt.executeQuery();
            while(rs.next()) {
            	System.out.println(rs.getString(1));
            	String admincode=rs.getString(1);
            if(adminid.equals(admincode)) {
            	out.println("<h1>login valid</h1>");
            	res.sendRedirect("control.html");
            	
            }
            else {
            	out.println("<center><h2>invalid login<h2></center><br>");
            	RequestDispatcher rd=req.getRequestDispatcher("admin.html");
            	rd.include(req, res);
            }
            }
            out.println("<h1 align='center' >INVALID USERNAME PLEASE TRY AGAIN</h1>");
            RequestDispatcher rd=req.getRequestDispatcher("admin.html");
        	rd.include(req, res);
			
			
		}
		catch(Exception e) {
			out.println(e);
			
		}
		
	}
	
}