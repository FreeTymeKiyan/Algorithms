package com.freetymekiyan.atoi;
import java.security.InvalidParameterException;

/**
 * Convert a String to integer 
 * 1. error check
 * 2. sign check
 * 3. number check
 * 4. calculation
 * 5. return
 * 
 * @author Kiyan
 */
public class Convert {
	
	public static int convert(String s){
	    if(s == null || s.length() == 0){ // error check
	        throw new InvalidParameterException();
	    }
	    
	    int ret = 0;
	    boolean isNegtive = false; // sign check

	    for(int i = 0; i < s.length(); i++){
	        char c = s.charAt(i);
	        if( i == 0 && (c == '-')){
	            isNegtive = true;
	            continue;
	        }
	        if(c - '0' < 0 || c - '0' > 10){ // not number
	            throw new InvalidParameterException();
	        }
	        ret = ret * 10 + (c - '0');
	    } 
	    return isNegtive ? (0 - ret) : ret;
	}
}