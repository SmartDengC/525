package cn.workshop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.workshop.model.downSourceModel;
import cn.workshop.model.noticeInfoModel;
import cn.workshop.service.impl.dowmSourseImpl;
import cn.workshop.service.impl.noticeInfoImpl;

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
		request.setCharacterEncoding("UTF-8");  //请求页面的编码
		response.setCharacterEncoding("UTF-8");  //响应页面的编码
		if(request.getParameter("action")!=null && request.getParameter("action").equals("delect"))//删除
		{
			dowmSourseImpl dsi=new dowmSourseImpl();
			
			if(!dsi.deleteDownSource(request.getParameter("id")))
			{
				System.out.println("删除信息失败！");
			}			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("updata"))//资源修改
		{
			if(request.getParameter("id")!=null && request.getParameter("key").equals("1"))//这是noticeInfoAdmin发过来的页面
			{
				//这里要把这个id的dowmSourse数据查询出来，发送到那个model页面
				dowmSourseImpl dsi=new dowmSourseImpl();
				downSourceModel adm=dsi.getOneDownSource(request.getParameter("id"));
				request.setAttribute("dowmSourse", adm);
				request.getRequestDispatcher("/downSourseModel.jsp").forward(request, response);
				return ;
			}
			else if(request.getParameter("id")!=null && request.getParameter("key").equals("2"))//这是noticeInfomodel发过来的页面
			{
				dowmSourseImpl dsi=new dowmSourseImpl();
				downSourceModel adm=new downSourceModel();
				adm.setId(request.getParameter("id"));
				adm.setIntroduce(request.getParameter("introduce"));
				adm.setName(request.getParameter("name"));
				adm.setPictureUrl("01.jpg");//前端没有参数
				adm.setTime(request.getParameter("time"));
				adm.setUrl(request.getParameter("url"));
				if(!dsi.modifyDownSource(adm))
				{
					System.out.println("添加资源出错!");
				}
			}
			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("insert"))//资源增加
		{
			dowmSourseImpl dsi=new dowmSourseImpl();
			downSourceModel adm=new downSourceModel();
			adm.setIntroduce(request.getParameter("introduce"));
			adm.setName(request.getParameter("name"));
			adm.setPictureUrl("01.jpg");//前端没有参数
			adm.setTime(request.getParameter("time"));
			adm.setUrl(request.getParameter("url"));
			if(!dsi.addDownSource(adm))
			{
				System.out.println("添加资源出错!");
			}
			
			
		}
		dowmSourseImpl dsi=new dowmSourseImpl();
		List<downSourceModel> list=dsi.getAllDownSource();
		request.setAttribute("dowmSourse", list);
		if(request.getSession().getAttribute("admin")!=null && request.getSession().getAttribute("admin")=="admin")
		{
			request.getRequestDispatcher("/downSourceAdmin.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/downSource.jsp").forward(request, response);
		}
		
		
		
		
		
		/*                                         */
		
		
//		if(request.getParameter("action").equals("a"))
//		{
//			downSourceModel ds=new downSourceModel();
//			ds.setIntroduce(request.getParameter("introduce"));
//			ds.setTime(request.getParameter("time"));
//			ds.setUrl(request.getParameter("url"));
//			ds.setPictureUrl("01.jpg");
//			
//		}
//		else if(request.getParameter("action").equals("d"))
//		{
//			
//		}
//		else if(request.getParameter("action").equals("s"))
//		{
//			dowmSourseImpl dsi=new dowmSourseImpl();
//			List<downSourceModel> list=dsi.getAllDownSource();
//			request.setAttribute("dowmSourse", list);
//			request.getRequestDispatcher("/downSource.jsp").forward(request,response);
//		}
//		else if(request.getParameter("action").equals("u"))
//		{
//			
//		}
	}
}
