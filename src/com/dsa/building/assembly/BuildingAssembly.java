package com.dsa.building.assembly;

import java.util.Arrays;

import com.dsa.util.InsertionSortUtil;

/**
 * Business logic class to assemble floors based on their availability
 * 
 * @author fullstack8
 *
 */
public class BuildingAssembly {

	public static void assembleBuilding(int[][] floorsAndDays) {
		
		// Sort this array based on Floor size in decreasing order.
		InsertionSortUtil.insertionSort(floorsAndDays);

//		System.out.println("\nSorted Array in Decreasing order of Floor Size");
		for (int i = 0; i < floorsAndDays.length; i++) {
//			System.out.println(Arrays.toString(floorsAndDays[i]));
		}

		System.out.println(
				"\nNow iterating DS and \nif Largest unassembled floor is unavailable TODAY then no floor is assembled today");

		int floorIndex = 0;
		
		// External FOR for Days
		for (int i = 0; i < floorsAndDays.length; i++) {
			System.out.println("Day " + (i + 1) + " Floors made today : ");
			
			// Floors which are available TODAY or before can be assembled
			while (floorIndex < floorsAndDays.length) {
				if (floorsAndDays[floorIndex][1] <= (i + 1)) {
					System.out.println("\tFloor : " + floorsAndDays[floorIndex][0]);
					floorIndex++;
				} else {
					break;
				}
			}
		}
	}
}
