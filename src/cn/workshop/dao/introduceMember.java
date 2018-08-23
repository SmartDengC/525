package cn.workshop.dao;

import java.util.List;
//import cn.workshop.model.introduceMember;

import cn.workshop.model.downSourceModel;
import cn.workshop.model.introduceMemberModel;

public interface introduceMember {
	/**
	 * 查询表中的所有数据 
	 * @return 返回一个list集合
	 */
	public List<introduceMemberModel> introduceMember();
	
	/**
	 * 对数据库表introduceMemberModel中数据的增加 
	 */
	public Boolean addIntroduceMember(introduceMemberModel im);
	
	/**
	 * 对数据库表introduceMemberModel中数据的删除
	 * 判断条件 使用ID
	 */
	
	public Boolean deleteIntroduceMember(String id);
	/**
	 * 数据库表introduceMemberModel的修改
	 * 判断条件ID
	 */
	public Boolean modifyDownSource(introduceMemberModel im);
	
	
	
	
}
