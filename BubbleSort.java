//Bubble sort
package com.java;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 
		 * creating scanner class object to take input from the user 
		 */
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();

		System.out.print("Enter the elements you want to sort: \n");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		/*
		 * printing array before sort 
		 */
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

/*
 * method to sort the numbers
 */
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}
}
	

