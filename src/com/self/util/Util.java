package com.self.util;

/**
 * 工具类
 * @author Zp
 */
public class Util {
	
	/**
	 * Object转String，对象为空时返回空字符串
	 * @param obj 转换对象
	 * @return 字符串
	 */
	public static String objToString(Object obj) {
		return obj==null?"":obj.toString();
	}
	
}
