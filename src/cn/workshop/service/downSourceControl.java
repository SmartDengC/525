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
	public List<downSource> getAllDownSource();
}
