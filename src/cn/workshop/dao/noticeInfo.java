package cn.workshop.dao;

import java.util.List;

import cn.workshop.model.introduceMemberModel;
import cn.workshop.model.noticeInfoModel;

public interface noticeInfo {
	/**
	 * ʵ�ֶ����ݿ��noticeinfo��Ϣ�Ĳ�ѯ 
	 * @return list����
	 * @param
	 */
	public List<noticeInfoModel> queryNoticeInfo();
	 
		/**
		 * �����ݿ��noticeinfo�����ݵ����� 
		 */
	public Boolean addNoticeinfo(noticeInfoModel ni);
		
		/**
		 * �����ݿ��noticeinfo�����ݵ�ɾ��
		 * �ж����� ʹ��ID
		 */
		
	public Boolean  deleteNoticeinfo(String id);
		/**
		 * ���ݿ��noticeinfo���޸�
		 * �ж�����ID
		 */
	public Boolean modifyNoticeinfo(noticeInfoModel ni);
	 
	 /**
	  * ��ѯһ����Ϣ
	  * @param id ��Ϣ��ID
	  * @return ���ط�װ�õ���Ϣ
	  */
	public noticeInfoModel queryOneNoticeInfo(String id);
}
