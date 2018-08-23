package cn.workshop.dao;

import java.util.List;

import cn.workshop.model.downSourceModel;

public interface downSource {
	/**
	 * ʵ�ֶ����ݿ�� downcource ����Ϣ�Ĳ�ѯ 
	 * ����һ��list����
	 */
	public List<downSourceModel> queryDownSource();
	
	/**
	 * �����ݿ��downsource�����ݵ����� 
	 */
	public Boolean addDownSource(downSourceModel ds);
	
	/**
	 * �����ݿ��downsource�����ݵ�ɾ��
	 * �ж����� ʹ��ID
	 */	
	public Boolean deleteDownSource(String id);
	/**
	 * ���ݿ��downsource���޸�
	 * �ж�����ID
	 */
	public Boolean modifyDownSource(downSourceModel ds);
	
	

	
}
