package cn.workshop.dao;

import java.util.List;

import cn.workshop.model.introduceMemberModel;
import cn.workshop.model.noticeInfoModel;

public interface noticeInfo {
	/**
	 * 实现对数据库表noticeinfo信息的查询 
	 * @return list集合
	 * @param
	 */
	public List<noticeInfoModel> queryNoticeInfo();
	 
		/**
		 * 对数据库表noticeinfo中数据的增加 
		 */
	public Boolean addNoticeinfo(noticeInfoModel ni);
		
		/**
		 * 对数据库表noticeinfo中数据的删除
		 * 判断条件 使用ID
		 */
		
	public Boolean  deleteNoticeinfo(String id);
		/**
		 * 数据库表noticeinfo的修改
		 * 判断条件ID
		 */
	public Boolean modifyNoticeinfo(noticeInfoModel ni);
	 
	 /**
	  * 查询一条信息
	  * @param id 信息的ID
	  * @return 返回封装好的信息
	  */
	public noticeInfoModel queryOneNoticeInfo(String id);
}
