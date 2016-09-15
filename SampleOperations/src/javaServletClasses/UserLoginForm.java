package javaServletClasses;

import java.io.IOException;
import java.sql.SQLException;
import javaBeans.UserDetails;
import javaBusinessLogic.UserBusinessLogic;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLoginForm
 */
public class UserLoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			myCommonMethod(request,response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			myCommonMethod(request,response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void myCommonMethod(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException
	{
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName(request.getParameter("UserName"));
		userDetails.setLastName(request.getParameter("Password"));
		System.out.println("username ="+userDetails.getFirstName()+ "\n password = "+userDetails.getLastName());
		UserBusinessLogic ubl = new UserBusinessLogic();
		if(ubl.validateUserLogin(userDetails) == true)
		{
			response.sendRedirect("Pages/SampleOperations/SampleOperations.jsp?loggedInUser="+userDetails.getFirstName()+"");
		}
		else
		{
			response.sendRedirect("Pages/MainPages/Home.jsp?error='yes'");
		}
	}
}
