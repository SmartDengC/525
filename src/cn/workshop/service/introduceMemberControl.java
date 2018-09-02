package cn.workshop.service;

import java.util.List;
import cn.workshop.model.introduceMemberModel;
import cn.workshop.model.noticeInfoModel;;

/*
 * 
 * 处理介绍成员页面的业务
 */
public interface introduceMemberControl {
	
	/**
	 * 
	 * @return 一个包包含有成员的List
	 */
	public List<introduceMemberModel> getAllIntroduceMenber();
	
	/**
	 * 查询一个人员
	 * @param id 人员id
	 * @return 一个人员对象
	 */
	public introduceMemberModel getOneIntroduceMenber(String id);
	/**
	 * 添加一个成员
	 * @param im 成员对象
	 * @return 执行情况
	 */
	public Boolean addIntroduceMember(introduceMemberModel im);
	
	/**
	 * 删除一个成员
	 * @param id 成员id
	 * @return 执行情况
	 */
	public Boolean deleteIntroduceMember(String id);
	
	/**
	 * 修改成员信息
	 * @param im 成员对象
	 * @return 执行情况
	 */
	public Boolean modifyIntroduceMember(introduceMemberModel im);
}
