package cn.workshop.service;

import java.util.List;
import cn.workshop.model.*;
/*
 * 
 * ������Դ����ҳ���ҵ��
 */
public interface downSourceControl {
	
	/**
	 * 
	 * 
	 * @return һ������������Դ��List����
	 */
	public List<downSourceModel> getAllDownSource();
	
	/**
	 * ��ȡһ����Դ
	 * @param id ��Դid
	 * @return һ����Դ����
	 */
	public downSourceModel getOneDownSource(String id);
	/**
	 *���һ����Դ 
	 * @param ds Ҫ��ӵ���Դ����
	 * @return �����Ƿ�ִ�гɹ�
	 */
	public Boolean addDownSource(downSourceModel ds);
	
	/**
	 * �޸�һ����Դ
	 * @param ds Ҫ�޸ĵ���Դ����
	 * @return ����ִ�����
	 */
	public Boolean modifyDownSource(downSourceModel ds);
	
	/**
	 * 
	 * ɾ��һ����Դ
	 * @param id Ҫɾ����Դ��Id
	 * @return ����ִ�����
	 */
	public Boolean deleteDownSource(String id);
}
