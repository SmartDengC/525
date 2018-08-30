package cn.workshop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.workshop.model.noticeInfoModel;
import cn.workshop.service.impl.noticeInfoImpl;

/**
 * Servlet implementation class noticeInfoServlet
 */
@WebServlet("/noticeInfoServlet")
public class noticeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public noticeInfoServlet() {
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
		//doGet(request, response);
		List<noticeInfoModel>list=null;
		noticeInfoImpl nii=new noticeInfoImpl();
		list=nii.getAllNoticeInfo();		
		request.setAttribute("noticeInfo", list);
		if(request.getSession().getAttribute("admin")!=null && request.getSession().getAttribute("admin")=="admin")
		{
			request.getRequestDispatcher("/noticeInfoAdmin.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/noticeInfo.jsp").forward(request, response);
		}		
	}

}
