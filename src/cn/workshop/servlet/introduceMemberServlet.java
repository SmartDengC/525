package cn.workshop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.workshop.model.introduceMemberModel;
import cn.workshop.model.noticeInfoModel;
import cn.workshop.service.impl.introduceMemberImpl;
import cn.workshop.service.impl.noticeInfoImpl;

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
		request.setCharacterEncoding("UTF-8");  //请求页面的编码
		response.setCharacterEncoding("UTF-8");  //响应页面的编码
		if(request.getParameter("action")!=null && request.getParameter("action").equals("delect"))//删除
		{
			
			
			if((request.getParameter("id")))
			{
				System.out.println("删除信息失败！");
			}			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("updata"))//修改
		{
			if(request.getParameter("id")!=null && request.getParameter("key").equals("1"))//这是noticeInfoAdmin发过来的页面
			{
				//这里要把这个id的noticeInfo数据查询出来，发送到那个model页面
				
				request.setAttribute("noticeInfo", nim);
				request.getRequestDispatcher("/noticeInfomodel.jsp?action=updata").forward(request, response);
				return ;
			}
			else if(request.getParameter("id")!=null && request.getParameter("key").equals("2"))//这是noticeInfomodel发过来的页面
			{
				
				if(!)
					System.out.println("添加失败");
			}
			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("insert"))//增加
		{			
		}
		
		introduceMemberImpl imi=new introduceMemberImpl();
		List<introduceMemberModel> list=null;
		list=imi.getAllIntroduceMenber();
		request.setAttribute("introduceMember", list);
		if(request.getSession().getAttribute("admin")!=null && request.getSession().getAttribute("admin")=="admin")
		{
			request.getRequestDispatcher("/introduceMemberAdmin.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/introduceMember.jsp").forward(request, response);
		}
	}

}
