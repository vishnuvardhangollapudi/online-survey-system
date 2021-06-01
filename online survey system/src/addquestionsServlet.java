

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
@WebServlet("/addemployee")
public class addquestionsServlet extends HttpServlet {
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String n=req.getParameter("number");
		int n1=Integer.parseInt(n);
		int i=1;
		while(i<=n1) {
			String c1=String.valueOf(i);
		String question=req.getParameter("question"+c1);
		String option1=req.getParameter("opt"+c1+'A');
		String option2=req.getParameter("opt"+c1+'B');
		String option3=req.getParameter("opt3"+c1+'C');
		String option4=req.getParameter("opt4"+c1+'D');
	    
	
	try {
		Connection con=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
		PreparedStatement psmt=con.prepareStatement("insert into questions values(?,?,?,?,?,?)");
		PreparedStatement psmt1=con.prepareStatement("insert into result values(?,?,?,?,?)");
		psmt.setInt(1,i);
		psmt.setString(2,question);
		psmt.setString(3,option1);
		psmt.setString(4,option2);
		psmt.setString(5,option3);
		psmt.setString(6,option4);
		psmt1.setInt(1,i);
		psmt1.setInt(2,0);
		psmt1.setInt(3,0);
		psmt1.setInt(4,0);
		psmt1.setInt(5,0);
		
		int n2=psmt.executeUpdate();
		int n3=psmt1.executeUpdate();
		
		if(n2>0 && n3>0) {
			 RequestDispatcher rd=req.getRequestDispatcher("home.html");
			 rd.forward(req, res);
		}
		else {
			out.println("not entered");
		}
	}
	catch(Exception e) {
		out.println(e);
	}
	i++;
		}
	}
	

}
