package com.freetymekiyan.atoi;
import java.security.InvalidParameterException;

/**
 * Convert a String to integer 
 * 
 * @author Kiyan
 */
public class Convert {
	
	public static int convert(String s){
	    if(s == null || s.length() == 0){
	        throw new InvalidParameterException();
	    }
	    
	    int ret = 0;
	    boolean isNegtive = false;

	    for(int i = 0; i < s.length(); i++){
	        char c = s.charAt(i);
	        if( i == 0 && (c == '-')){
	            isNegtive = true;
	            continue;
	        }
	        if(c - '0' < 0 || c - '0' > 10){
	            throw new InvalidParameterException();
	        }
	        int tmp = c - '0';
	        ret *= 10;
	        ret += tmp;
	    } 
	    return isNegtive ? (ret - ret * 2) : ret;
	}
}
