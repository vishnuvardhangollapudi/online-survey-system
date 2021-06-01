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

@WebServlet("/retrivedata")
public class retrivedetailsServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String username=req.getParameter("uname");
		String password=req.getParameter("pwd");
		
		
		try {
			Connection con=null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver class loaded");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
			System.out.println("connect establisgedd");
			PreparedStatement psmt=con.prepareStatement("select * from users where USERNAME=?");
			System.out.println(username);
			psmt.setString(1,username);
		    ResultSet rs=psmt.executeQuery();
            if(rs.next()) {
            	System.out.println(rs.getString(3));
            if(password.equals(""+rs.getString(3)+"")) {
            	out.println("<h1>login valid</h1>");
            	res.sendRedirect("home1.html");
            	
            }
            else {
            	out.println("<center><h2>invalid login<h2></center><br>");
            	RequestDispatcher rd=req.getRequestDispatcher("signup.html");
            	rd.include(req, res);
            }
            }
            out.println("<h1 align='center' color=red>INVALID USERNAME PLEASE TRY AGAIN</h1>");
            RequestDispatcher rd=req.getRequestDispatcher("signup.html");
        	rd.include(req, res);
			
			
		}
		catch(Exception e) {
			out.println(e);
			
		}
		
	}
	
}