package com.qjl.utils;

public class StringUtil {
	
	/**
	 * @since 2016��4��21��
	 * @description �ж��ַ����Ƿ�Ϊ��
	 * @throws ��
	 * @param str
	 * @return boolean
	 */
	public static boolean isEmpty(String str){
		if(str == null || "".equals(str))
			return true;
		else 
			return false;
	}
	
	/**
	 * @since 2016��4��21��
	 * @description �ж��ַ�������strs���Ƿ�����ַ���str
	 * @throws ��
	 * @param str
	 * @param strs 
	 * @return boolean
	 */
	public static boolean existStr(String str, String[] strs){
		int length = strs.length;
		for(int i = 0; i < length; i++){
			if(strs[i].equals(str))
				return true;
		}
		return false;
	}
	
	
}
