package cn.workshop.service;
import java.util.List;
import cn.workshop.model.noticeInfoModel;
/*
 * 
 * ������Ϣ����ҳ���ҵ��
 */
public interface noticeInfoControl {
	
	/**
	 * 
	 * @return һ������������Ϣ��List
	 */
	public List<noticeInfoModel> getAllNoticeInfo();
	
	/**
	 * ����һ����Ϣ
	 * @param ni ��Ա��Ϣ
	 * @return ִ�����
	 */
	public Boolean addNoticeinfo(noticeInfoModel ni);
	
	
	/**
	 * ɾ��һ����Ϣ
	 * @param id ��Ϣ��id	
	 * @return ִ�����
	 */
	public Boolean  deleteNoticeinfo(String id);
	
	/**
	 * �޸�һ����Ϣ
	 * @param ni ��Ϣ����
	 * @return ִ�����
	 */
	public Boolean modifyNoticeinfo(noticeInfoModel ni);
}
