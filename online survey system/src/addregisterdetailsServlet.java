

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
@WebServlet("/addemployee1")
public class addregisterdetailsServlet extends HttpServlet {
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String username=req.getParameter("uname");
		String password=req.getParameter("pwd");
		String email=req.getParameter("mail");
		int id= (int)(Math.random()*99999)+1;
		
		
	    
	
	try {
		Connection con=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
		PreparedStatement psmt=con.prepareStatement("insert into users values(?,?,?,?)");
		psmt.setInt(1,id);
		psmt.setString(2,username);
		psmt.setString(3,password);
		psmt.setString(4,email);
		
		int n=psmt.executeUpdate();
		
		if(n>0) {
			 RequestDispatcher rd=req.getRequestDispatcher("signup.html");
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
