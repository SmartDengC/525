package cn.workshop.service;
import java.util.List;
import cn.workshop.model.noticeInfoModel;
/*
 * 
 * ��������Ϣ����ҳ���ҵ��
 */
public interface noticeInfoControl {
	
	/**
	 * 
	 * @return һ������������Ϣ��List
	 */
	public List<noticeInfoModel> getAllNoticeInfo();
}
