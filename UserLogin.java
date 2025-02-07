package source;

import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.DbConnection;


@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement ps;
	ResultSet rs;
	String email;
	String pwd;

	public void init(ServletConfig config) throws ServletException 
	{
		try
		{
			con = DbConnection.getConnection();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}	
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		try 
		{
			res.setContentType("text/html");  
	        PrintWriter out=res.getWriter();
			email=req.getParameter("email");
			pwd=req.getParameter("pwd");
			System.out.println(email);
			System.out.println(pwd);
			
			ps=con.prepareStatement("select * from user_data where email=? and pwd=?");
			//System.out.println(ps);
			ps.setString(1, email);
			ps.setString(2, pwd);
			rs = ps.executeQuery();
			HttpSession session=req.getSession(true);
			if (rs.next())
			{
				String uname=rs.getString("uname");
				session.setAttribute("uname",uname);
				session.setAttribute("email",email);
				
				res.sendRedirect("Home.jsp?logdone");
			} 
			else 
			{
			 	out.print("<h1>Sorry, username or password incorrect, Please register first!</h1>");
			 	res.sendRedirect("index.jsp?logfail");
			}
			out.close();  
		}
		
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
}
