package com.dsa.util;

import java.util.Arrays;

/**
 * Insertion sort is the best for SMALL ARRAYS sorting
 * 
 * @author fullstack8
 *
 */
public class InsertionSortUtil {

	/**
	 * Sort 2D array of Currency Denominations in Descending order
	 * 
	 * @param array
	 */
	public static void insertionSort(int array[][]) {
		System.out.println("\n\n====INSERTION SORT FOR SMALL 2D-ARRAY=====");
		int n = array.length;
		int forCount = 0, whileCount = 0;
		for (int j = 1; j < n; j++) {
			int[] key = array[j];

			int i = j - 1;
			while ((i > -1) && (array[i][0] < key[0])) {
				array[i + 1] = array[i];
				i--;
//				System.out.println("whileCount - " + ++whileCount + " - " + Arrays.toString(array[i + 1]));

			}
			array[i + 1] = key;
//			System.out.println("forCount - " + ++forCount + " - " + Arrays.toString(array[i + 1]));

		}
	}

}
