package com.freetymekiyan.atoi;

/**
 * 1. error check
 * 2. skip spaces
 * 3. sign check
 * 4. number check
 * 5. calculation, num = num * 10 + (str.charAt(i) - '0');
 * 6. range check
 * 7. return
 * 
 * @author Kiyan
 */
public class Convert2 {
	
    public int atoi(String str) {
        int len = str.length();
        if (len < 1) // error check
            return 0;
        int sign = 1; // sign check
        int index = 0;
        while (str.charAt(index) == ' ') { // skip spaces
            index++;
        }
        if (str.charAt(index) == '+') {
            index++;
        } else if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        long num = 0;
        for (; index < len; index++) {
            if (str.charAt(index) < '0' || str.charAt(index) > '9') // not number
                break;
            num = num * 10 + (str.charAt(index) - '0');
            if (num > Integer.MAX_VALUE && sign == 1) // exceed integer range
                break;
        }   
        if (num*sign > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (num*sign < Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
        return (int)num*sign; // long to int
    }	
}
