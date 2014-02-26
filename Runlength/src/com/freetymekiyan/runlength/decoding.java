package com.freetymekiyan.runlength;

/**
 * Run Length Decoding
 * 		w4a3d1e1x6
 * => 	wwwwaaadexxxxxx
 * 
 * @author Kiyan
 */
public class decoding {
	
	public static void main(String[] args) {
		String src = "w4a3d1e1x6";
		StringBuffer dest = new StringBuffer();
		
		for (int i = 0; i < src.length() - 1; i = i + 2) {
			char charAt = src.charAt(i);
			dest.append(charAt);
			int cnt = Integer.valueOf(src.charAt(i + 1) + "");
			for (int j = 0; j < cnt - 1; j++) {
				dest.append(charAt);
			}
		}
		System.out.println(dest.toString());
	}
}
