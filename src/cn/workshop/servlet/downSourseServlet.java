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
		request.setCharacterEncoding("UTF-8");  //����ҳ��ı���
		response.setCharacterEncoding("UTF-8");  //��Ӧҳ��ı���
		if(request.getParameter("action")!=null && request.getParameter("action").equals("delect"))//ɾ��
		{
			dowmSourseImpl dsi=new dowmSourseImpl();
			
			if(!dsi.deleteDownSource(request.getParameter("id")))
			{
				System.out.println("ɾ����Ϣʧ�ܣ�");
			}			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("updata"))//��Դ�޸�
		{
			if(request.getParameter("id")!=null && request.getParameter("key").equals("1"))//����noticeInfoAdmin��������ҳ��
			{
				//����Ҫ�����id��dowmSourse���ݲ�ѯ���������͵��Ǹ�modelҳ��
				dowmSourseImpl dsi=new dowmSourseImpl();
				downSourceModel adm=dsi.getOneDownSource(request.getParameter("id"));
				request.setAttribute("dowmSourse", adm);
				request.getRequestDispatcher("/downSourseModel.jsp").forward(request, response);
				return ;
			}
			else if(request.getParameter("id")!=null && request.getParameter("key").equals("2"))//����noticeInfomodel��������ҳ��
			{
				dowmSourseImpl dsi=new dowmSourseImpl();
				downSourceModel adm=new downSourceModel();
				adm.setId(request.getParameter("id"));
				adm.setIntroduce(request.getParameter("introduce"));
				adm.setName(request.getParameter("name"));
				adm.setPictureUrl("01.jpg");//ǰ��û�в���
				adm.setTime(request.getParameter("time"));
				adm.setUrl(request.getParameter("url"));
				if(!dsi.modifyDownSource(adm))
				{
					System.out.println("�����Դ����!");
				}
			}
			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("insert"))//��Դ����
		{
			dowmSourseImpl dsi=new dowmSourseImpl();
			downSourceModel adm=new downSourceModel();
			adm.setIntroduce(request.getParameter("introduce"));
			adm.setName(request.getParameter("name"));
			adm.setPictureUrl("01.jpg");//ǰ��û�в���
			adm.setTime(request.getParameter("time"));
			adm.setUrl(request.getParameter("url"));
			if(!dsi.addDownSource(adm))
			{
				System.out.println("�����Դ����!");
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
