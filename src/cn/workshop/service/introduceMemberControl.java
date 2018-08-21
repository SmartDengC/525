package cn.workshop.service;

import java.util.List;
import cn.workshop.model.introduceMemberModel;;

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
}
