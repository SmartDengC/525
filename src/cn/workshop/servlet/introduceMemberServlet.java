package cn.workshop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.workshop.dao.introduceMember;
import cn.workshop.service.impl.introduceMemberImpl;

/**
 * Servlet implementation class introduceMemberServlet
 */
@WebServlet("/introduceMemberServlet")
public class introduceMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public introduceMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		introduceMemberImpl imi=new introduceMemberImpl();
		List<introduceMember> list=null;
		list=imi.introduceMember();
		request.setAttribute("introduceMember", list);
		request.getRequestDispatcher("/introduceMember.jsp").forward(request, response);
	}

}
