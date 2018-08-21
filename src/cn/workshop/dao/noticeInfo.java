package cn.workshop.dao;

import java.util.List;

import cn.workshop.model.noticeInfoModel;

public interface noticeInfo {
	/**
	 * 实现对数据库表noticeinfo信息的查询 
	 * @return list集合
	 * @param
	 */
	 List<noticeInfoModel> queryNoticeInfo();
	 
	 
	 
	 
	
}
