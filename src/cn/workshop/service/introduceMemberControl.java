package cn.workshop.service;

import java.util.List;
import cn.workshop.model.introduceMemberModel;
import cn.workshop.model.noticeInfoModel;;

/*
 * 
 * ������ܳ�Աҳ���ҵ��
 */
public interface introduceMemberControl {
	
	/**
	 * 
	 * @return һ���������г�Ա��List
	 */
	public List<introduceMemberModel> getAllIntroduceMenber();
	
	/**
	 * ��ѯһ����Ա
	 * @param id ��Աid
	 * @return һ����Ա����
	 */
	public introduceMemberModel getOneIntroduceMenber(String id);
	/**
	 * ���һ����Ա
	 * @param im ��Ա����
	 * @return ִ�����
	 */
	public Boolean addIntroduceMember(introduceMemberModel im);
	
	/**
	 * ɾ��һ����Ա
	 * @param id ��Աid
	 * @return ִ�����
	 */
	public Boolean deleteIntroduceMember(String id);
	
	/**
	 * �޸ĳ�Ա��Ϣ
	 * @param im ��Ա����
	 * @return ִ�����
	 */
	public Boolean modifyIntroduceMember(introduceMemberModel im);
}
