package cn.workshop.dao;

import java.util.List;

import cn.workshop.model.downSourceModel;

public interface downSource {
	/**
	 * ʵ�ֶ����ݿ�� downcource ����Ϣ�Ĳ�ѯ 
	 * ����һ��list����
	 */
	List<downSourceModel> queryDownSource();
	

	
}
