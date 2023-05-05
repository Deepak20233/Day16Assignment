package com.java;
import java.util.*;
public class BinarySearchFromWordList {
	public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape"};

        // Sort the array in alphabetical order
        Arrays.sort(words);

        // Search for the word "date"
        String target = "date";
        int index = binarySearch(words, target);

        // Print the result
        if (index != -1) {
            System.out.println("The word \"" + target + "\" is found at index " + index);
        } else {
            System.out.println("The word \"" + target + "\" is not found");
        }
    }

    // Binary search algorithm
    public static int binarySearch(String[] words, String target) {
        int left = 0;
        int right = words.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (words[mid].equals(target)) {
                return mid;
            } else if (words[mid].compareTo(target) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If the word is not found, return -1
        return -1;
    }
}