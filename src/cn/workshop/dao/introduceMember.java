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
	public List<introduceMemberModel> introduceMember();
	
	/**
	 * �����ݿ��introduceMemberModel�����ݵ����� 
	 */
	public Boolean addIntroduceMember(introduceMemberModel im);
	
	/**
	 * �����ݿ��introduceMemberModel�����ݵ�ɾ��
	 * �ж����� ʹ��ID
	 */
	
	public Boolean deleteIntroduceMember(String id);
	/**
	 * ���ݿ��introduceMemberModel���޸�
	 * �ж�����ID
	 */
	public Boolean modifyDownSource(introduceMemberModel im);
	
	
	
	
}
