package cn.workshop.dao;

import java.util.List;

import cn.workshop.model.downSourceModel;

public interface downSource {
	/**
	 * ʵ�ֶ����ݿ�� downcource ����Ϣ�Ĳ�ѯ 
	 * ����һ��list����
	 */
	List<downSourceModel> queryDownSource();
	
	/**
	 * �����ݿ��downsource�����ݵ����� 
	 */
	List<downSourceModel> addDownSource(String id);
	
	/**
	 * �����ݿ��downsource�����ݵ�ɾ��
	 * �ж����� ʹ��ID
	 */
	
	Boolean deleteDownSource(String id);
	/**
	 * ���ݿ��downsource���޸�
	 * �ж�����ID
	 */
	Boolean modifyDownSource(String id);
	
	

	
}
