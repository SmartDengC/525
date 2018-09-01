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
		request.setCharacterEncoding("UTF-8");  //����ҳ��ı���
		response.setCharacterEncoding("UTF-8");  //��Ӧҳ��ı���
		if(request.getParameter("action")!=null && request.getParameter("action").equals("delect"))//ɾ��
		{
			
			
			if((request.getParameter("id")))
			{
				System.out.println("ɾ����Ϣʧ�ܣ�");
			}			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("updata"))//�޸�
		{
			if(request.getParameter("id")!=null && request.getParameter("key").equals("1"))//����noticeInfoAdmin��������ҳ��
			{
				//����Ҫ�����id��noticeInfo���ݲ�ѯ���������͵��Ǹ�modelҳ��
				
				request.setAttribute("noticeInfo", nim);
				request.getRequestDispatcher("/noticeInfomodel.jsp?action=updata").forward(request, response);
				return ;
			}
			else if(request.getParameter("id")!=null && request.getParameter("key").equals("2"))//����noticeInfomodel��������ҳ��
			{
				
				if(!)
					System.out.println("���ʧ��");
			}
			
		}
		else if(request.getParameter("action")!=null && request.getParameter("action").equals("insert"))//����
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
