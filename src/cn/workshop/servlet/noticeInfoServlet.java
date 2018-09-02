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
	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");  //请求页面的编码
		response.setCharacterEncoding("UTF-8");  //响应页面的编码
		
		if(request.getParameter("action")!=null && request.getParameter("action").equals("delect"))//删除
		{
			noticeInfoImpl nii=new noticeInfoImpl();
			
			if(!nii.deleteNoticeinfo(request.getParameter("id")))
			{
				System.out.println("删除信息失败！");
			}			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("updata"))//修改
		{
			if(request.getParameter("id")!=null && request.getParameter("key").equals("1"))//这是noticeInfoAdmin发过来的页面
			{
				//这里要把这个id的noticeInfo数据查询出来，发送到那个model页面
				noticeInfoImpl nii=new noticeInfoImpl();
				noticeInfoModel nim=nii.getOneNoticeInfo(request.getParameter("id"));
				request.setAttribute("noticeInfo", nim);
				request.getRequestDispatcher("/noticeInfomodel.jsp?action=updata").forward(request, response);
				return ;
			}
			else if(request.getParameter("id")!=null && request.getParameter("key").equals("2"))//这是noticeInfomodel发过来的页面
			{
				noticeInfoModel nim=new noticeInfoModel();			
				nim.setPictureUrl(null);				
				nim.setId(request.getParameter("id"));
				nim.setTitle(request.getParameter("title"));
				nim.setTime(request.getParameter("time"));
				nim.setText(request.getParameter("text"));
				noticeInfoImpl nii=new noticeInfoImpl();
				if(!nii.modifyNoticeinfo(nim))
					System.out.println("添加失败");
			}
			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("insert"))//增加
		{
			noticeInfoModel nim=new noticeInfoModel();
			nim.setPictureUrl(null);
			nim.setTitle(request.getParameter("title"));
			nim.setTime(request.getParameter("time"));
			nim.setText(request.getParameter("text"));
			noticeInfoImpl nii=new noticeInfoImpl();
			nii.addNoticeinfo(nim);
		}

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
