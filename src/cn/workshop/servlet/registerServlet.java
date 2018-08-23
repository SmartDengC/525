package cn.workshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.workshop.model.introduceMemberModel;
import cn.workshop.service.impl.registerImpl;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet() {
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
		introduceMemberModel im=new introduceMemberModel();
		im.setName(request.getParameter("name"));
		im.setDuty(request.getParameter("duty"));
		im.setIntroduce(request.getParameter("introduce"));
		im.setContactInformation(request.getParameter("contactInformation"));
		im.setKey("0");
		im.setPictureUrl("01.jpg");
//		if(request.getParameter("pictureUrl")!=null)
//		{
//			im.setPictureUrl(request.getParameter("pictureUrl"));
//		}
		if(im.getName()==null && im.getIntroduce()==null && im.getDuty()==null && im.getContactInformation()==null)
		{
			response.sendRedirect("regiser.jsp");
		}
		registerImpl ri=new registerImpl();
		if(ri.registerDeal(im))
		{
			//这里注册成功			
			response.sendRedirect("index.jsp");
			
		}
		else
		{
			response.sendRedirect("regiser.jsp");
		}
	}

}
