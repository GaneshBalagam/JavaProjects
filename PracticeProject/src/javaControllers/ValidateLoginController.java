package javaControllers;

import java.io.IOException;
import java.sql.SQLException;

import javaBusinessLogicPackage.DataBaseQuerries;
import javaBusinessLogicPackage.UserDetails;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateLoginController
 */
public class ValidateLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	try {
			doGetOrPost(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    
    protected void doGetOrPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
    	
    	String UserName = request.getParameter("UserName");
    	String Password = request.getParameter("Password");
    	
    	
    	if(new DataBaseQuerries("Sample").validateLoginDetails("test2", UserName, Password)  == false)
    		{
    			response.sendRedirect("Pages/Home.jsp?status=no");
    		}
    	else
    		{
    			response.sendRedirect("Pages/Home.jsp?status=yes");
    		
    		}
    		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 	try {
			doGetOrPost(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
