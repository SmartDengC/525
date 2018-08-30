package cn.workshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.workshop.service.impl.loginImpl;

/**
 * Servlet implementation class login
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String name=null,password=null;
			name=request.getParameter("name");
			password=request.getParameter("password");
			loginImpl ll=new loginImpl();
			if(ll.logindeal(name, password))
			{
				request.getSession().setAttribute("admin", "admin");
				request.getSession().setMaxInactiveInterval(10);
				request.getRequestDispatcher("/indexServlet").forward(request, response);
			}
			else
			{
				response.sendRedirect("login.jsp");
			}
	}

}
