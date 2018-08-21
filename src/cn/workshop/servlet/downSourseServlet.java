package cn.workshop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.workshop.dao.downSource;
import cn.workshop.model.downSourceModel;
import cn.workshop.service.impl.dowmSourseImpl;

/**
 * Servlet implementation class downSourseServlet
 */
@WebServlet("/downSourseServlet")
public class downSourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public downSourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		dowmSourseImpl dsi=new dowmSourseImpl();
		List<downSourceModel> list=dsi.queryDownSource();
		request.setAttribute("dowmSourse", list);
		request.getRequestDispatcher("/downSourse.jsp").forward(request,response);		
	}
}
