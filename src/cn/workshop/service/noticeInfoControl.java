package cn.workshop.service;
import java.util.List;
import cn.workshop.model.noticeInfoModel;
/*
 * 
 * 处理信息发布页面的业务
 */
public interface noticeInfoControl {
	
	/**
	 * 
	 * @return 一个包含所有信息的List
	 */
	public List<noticeInfoModel> getAllNoticeInfo();
	
	/**
	 * 增加一个信息
	 * @param ni 成员信息
	 * @return 执行情况
	 */
	public Boolean addNoticeinfo(noticeInfoModel ni);
	
	
	/**
	 * 删除一个信息
	 * @param id 信息的id	
	 * @return 执行情况
	 */
	public Boolean  deleteNoticeinfo(String id);
	
	/**
	 * 修改一个信息
	 * @param ni 信息对象
	 * @return 执行情况
	 */
	public Boolean modifyNoticeinfo(noticeInfoModel ni);
}
