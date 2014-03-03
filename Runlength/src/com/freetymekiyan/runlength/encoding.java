package com.freetymekiyan.runlength;

/**
 * Run Length Encoding
 * 		wwwwaaadexxxxxx		
 * =>	w4a3d1e1x6
 *  	
 * @author Kiyan
 */
public class encoding {
	
	public static void main(String[] args) {
		String src = "wwwwaaadexxxxxx";
		StringBuilder dest = new StringBuilder();
		
		for (int i = 0; i < src.length(); i++) {
			dest.append(src.charAt(i));
			int cnt = 1;
			while (i + 1 < src.length() && src.charAt(i) == src.charAt(i + 1)) { // fixed order
				i++;
				cnt++;
			}
			dest.append(cnt);
		}
		System.out.println(dest.toString());
	}
}