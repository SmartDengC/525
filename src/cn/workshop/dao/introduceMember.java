package cn.workshop.dao;

import java.util.List;
//import cn.workshop.model.introduceMember;

import cn.workshop.model.downSourceModel;
import cn.workshop.model.introduceMemberModel;

public interface introduceMember {
	/**
	 * ��ѯ���е��������� 
	 * @return ����һ��list����
	 */
	List<introduceMemberModel> introduceMember();
	
	/**
	 * �����ݿ��introduceMemberModel�����ݵ����� 
	 */
	Boolean addDownSource(String id);
	
	/**
	 * �����ݿ��introduceMemberModel�����ݵ�ɾ��
	 * �ж����� ʹ��ID
	 */
	
	Boolean deleteDownSource(String id);
	/**
	 * ���ݿ��introduceMemberModel���޸�
	 * �ж�����ID
	 */
	Boolean modifyDownSource(String id);
	
	
	
	
}
