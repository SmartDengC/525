package cn.workshop.dao;

import java.util.List;

import cn.workshop.model.downSourceModel;

public interface downSource {
	/**
	 * 实现对数据库表 downcource 的信息的查询 
	 * 返回一个list集合
	 */
	public List<downSourceModel> queryDownSource();
	
	/**
	 * 对数据库表downsource中数据的增加 
	 */
	public Boolean addDownSource(downSourceModel ds);
	
	/**
	 * 对数据库表downsource中数据的删除
	 * 判断条件 使用ID
	 */	
	public Boolean deleteDownSource(String id);
	/**
	 * 数据库表downsource的修改
	 * 判断条件ID
	 */
	public Boolean modifyDownSource(downSourceModel ds);
	
	

	
}
