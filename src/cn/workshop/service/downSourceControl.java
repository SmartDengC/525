package cn.workshop.service;

import java.util.List;
import cn.workshop.model.*;
/*
 * 
 * 处理资源下载页面的业务
 */
public interface downSourceControl {
	
	/**
	 * 
	 * 
	 * @return 一个所有下载资源的List集合
	 */
	public List<downSourceModel> getAllDownSource();
	
	/**
	 * 获取一个资源
	 * @param id 资源id
	 * @return 一个资源对象
	 */
	public downSourceModel getOneDownSource(String id);
	/**
	 *添加一个资源 
	 * @param ds 要添加的资源对象
	 * @return 返回是否执行成功
	 */
	public Boolean addDownSource(downSourceModel ds);
	
	/**
	 * 修改一个资源
	 * @param ds 要修改的资源对象
	 * @return 返回执行情况
	 */
	public Boolean modifyDownSource(downSourceModel ds);
	
	/**
	 * 
	 * 删除一个资源
	 * @param id 要删除资源的Id
	 * @return 返回执行情况
	 */
	public Boolean deleteDownSource(String id);
}
