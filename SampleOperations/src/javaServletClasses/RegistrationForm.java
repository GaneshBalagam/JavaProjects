package javaServletClasses;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.realm.UserDatabaseRealm;
import javaBeans.UserDetails;
import javaBusinessLogic.UserBusinessLogic;
/**
 * Servlet implementation class RegistrationForm
 */
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationForm() {
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
		
		//String firstName = request.getParameter("firstName");
		userDetails.setFirstName(request.getParameter("firstName"));
		
		//String lastName = request.getParameter("lastName");
		userDetails.setLastName(request.getParameter("lastName"));
		
		//String dateOfBirth = request.getParameter("dateOfBirth");
		userDetails.setDateOfBirth(request.getParameter("dateOfBirth"));
				
		//String dateOfBirth = request.getParameter("userId");
		userDetails.setUserId(Integer.parseInt(request.getParameter("userId")));
				
		//userDetails = new UserDetails(firstName,lastName,dateOfBirth);
		
		UserBusinessLogic ubl = new UserBusinessLogic();
		ubl.registerUser(userDetails);
		
		//request.setAttribute("status", userDetails.getFirstName());

		response.sendRedirect("Pages/MainPages/Registration.jsp?status="+userDetails.getFirstName()+"");
	}

	
}
