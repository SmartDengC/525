package cn.workshop.service;
import java.util.List;
import cn.workshop.model.noticeInfoModel;
/*
 * 
 * 处处理信息发布页面的业务
 */
public interface noticeInfoControl {
	
	/**
	 * 
	 * @return 一个包含所有信息的List
	 */
	public List<noticeInfoModel> getAllNoticeInfo();
}
