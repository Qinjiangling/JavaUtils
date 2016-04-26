package com.qjl.utils;

public class StringUtil {
	
	/**
	 * @since 2016年4月21日
	 * @description 判断字符串是否为空
	 * @throws 无
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
	 * @since 2016年4月21日
	 * @description 判断字符串数组strs中是否包含字符串str
	 * @throws 无
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
