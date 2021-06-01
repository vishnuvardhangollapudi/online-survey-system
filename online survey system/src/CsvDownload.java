import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CsvDownload {
	public static void main(String []args) {
		try{
			
			PrintWriter pw=new PrintWriter(new File("C:\\Users\\sandy\\Documents\\result.csv"));
			StringBuilder sb=new StringBuilder();
			
			Connection con=null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
			PreparedStatement psmt=con.prepareStatement("select * from questions");
			ResultSet rs=psmt.executeQuery();
			while(rs.next()){
				sb.append(rs.getInt(1));
				sb.append(",");
				sb.append(rs.getString(2));
				sb.append(",");
				sb.append(rs.getString(3));
				sb.append(",");
				sb.append(rs.getString(4));
				sb.append(",");
				sb.append(rs.getString(5));
				sb.append(",");
				sb.append(rs.getString(6));
				sb.append(",");
				
				
			}
			pw.write(sb.toString());
			pw.close();
			System.out.println("finished");
			
		}
		catch(Exception e){
		System.out.println(e);
		}
	}

}
