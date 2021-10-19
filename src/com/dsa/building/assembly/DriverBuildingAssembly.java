package com.dsa.building.assembly;

import java.util.Scanner;

/**
 * It Works!!! 
 * 2-D Array storing pair of  [Floor Size] [Day on which made available]
 * 
 * DESC- Sort the array as per floor size.
 * Now iterate the 2D array. 
 * Each Iteration is current day.
 * A Floor cannot be assembled unless larger Floors are assembled before it.
 * for the days when largest floor is unavailable print No floors done today. 
 * 
 * 
 * @author fullstack8
 *
 */
public class DriverBuildingAssembly {

	public static final Scanner sc = new Scanner(System.in);
	public static int floorAndDays[][]; // Stores Floor Size, Day on which it was made available
	
	public static void main(String[] args) {

		System.out.print("\nEnter the Number of Floors to Construct: ");
		int noOfFloors = sc.nextInt();
		floorAndDays = new int[noOfFloors][2];
		
		System.out.println("Enter the size of Floors available on follwing days: ");
		
		for(int i=0; i<noOfFloors; i++)
		{
			System.out.print("Day " + (i+1) + " : ");
			floorAndDays[i][0] = sc.nextInt();// Floor Size
			floorAndDays[i][1] = i+1;         // Day on which the above floor is made available
		}
		
		BuildingAssembly.assembleBuilding(floorAndDays);	
		
	}

}

//OUTPUT
//
//Enter the Number of Floors to Construct: 6
//Enter the size of Floors available on follwing days: 
//Day 1 : 4
//Day 2 : 5
//Day 3 : 6
//Day 4 : 1
//Day 5 : 3
//Day 6 : 2
//
//
//====INSERTION SORT FOR SMALL 2D-ARRAY=====
//
//Sorted Array in Decreasing order of Floor Size
//[6, 3]
//[5, 2]
//[4, 1]
//[3, 5]
//[2, 6]
//[1, 4]
//
//Now iterating over above array and 
//if Largest unassembled floor is unavailable TODAY then no floor is assembled today
//Day 1 Floors made today : 
//Day 2 Floors made today : 
//Day 3 Floors made today : 
//	Floor : 6
//	Floor : 5
//	Floor : 4
//Day 4 Floors made today : 
//Day 5 Floors made today : 
//	Floor : 3
//Day 6 Floors made today : 
//	Floor : 2
//	Floor : 1

