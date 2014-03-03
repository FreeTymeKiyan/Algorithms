package com.freetymekiyan.itoa;

/**
 * Convert an integer to String
 *  
 * @author Kiyan
 */
public class Convert {
	
	public String itoa(int src) {
		// error check
		if (src == 0) {
			return "0";
		}
		// sign check
		boolean isNegative = src < 0 ? true : false;
		src = isNegative ? (0 - src) : src;
		// calculation
		StringBuilder ret = new StringBuilder();
		while (src != 0) {
			int curNum = src % 10;
			ret.append(curNum);
			src = (src - curNum) / 10;
		}
		// return
		if (isNegative) {
			ret.append('-');
		}
		ret = ret.reverse();
		return ret.toString();
	}
}