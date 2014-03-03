package com.freetymekiyan.findcommon;

import java.util.HashSet;

/**
 * How to Find Common Elements of Two UnSorted Array?
 * <p>
 *	Find 1st small array.
 *	Iterate through small array and find elements in larger array.
 *	In case of match, add it to separate new array.
 *	Display final array.
 * </p>
 *
 * @author Kiyan
 */

public class FindCommon {
	
	public static void main(String[] args) {
        int[] arrayOne = { 1, 4, 5, 2, 7, 3, 9 };
        int[] arrayTwo = { 5, 2, 4, 9, 5 };
 
        Integer[] common = findCommon(arrayOne, arrayTwo);
 
        System.out.print( "Common Elements Between Two Arrays: " );       
        for(Integer entry : common) {
            System.out.print(entry + " ");
        }
    }
	
	private static Integer[] findCommon(int[] A, int[] B) {
		int[] arrayToHash;
		int[] arrayToSearch;
		
		if(A.length < B.length) {
			arrayToHash = A;
			arrayToSearch = B;
		} else {
			arrayToHash = B;
			arrayToSearch = A;
		}
		
		// hashset created for search 
		HashSet<Integer> hashedArr = new HashSet<>();
		for (Integer entry : arrayToHash) {
			hashedArr.add(entry);
		}
		
		// hashset created for result
		HashSet<Integer> intersetction = new HashSet<>();
		for (Integer entry : arrayToSearch) {
			if (hashedArr.contains(entry)) {
				intersetction.add(entry);
			}
		}
		return intersetction.toArray(new Integer[0]);
	}
}