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
	List<noticeInfoModel> queryNoticeInfo();
	 
		/**
		 * �����ݿ��noticeinfo�����ݵ����� 
		 */
		 Boolean addDownSource(String id);
		
		/**
		 * �����ݿ��noticeinfo�����ݵ�ɾ��
		 * �ж����� ʹ��ID
		 */
		
		Boolean  deleteDownSource(String id);
		/**
		 * ���ݿ��noticeinfo���޸�
		 * �ж�����ID
		 */
		Boolean modifyDownSource(String id);
	 
	 
	
}
