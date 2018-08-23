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
	List<noticeInfoModel> queryNoticeInfo();
	 
		/**
		 * 对数据库表noticeinfo中数据的增加 
		 */
		 Boolean addDownSource(String id);
		
		/**
		 * 对数据库表noticeinfo中数据的删除
		 * 判断条件 使用ID
		 */
		
		Boolean  deleteDownSource(String id);
		/**
		 * 数据库表noticeinfo的修改
		 * 判断条件ID
		 */
		Boolean modifyDownSource(String id);
	 
	 
	
}
