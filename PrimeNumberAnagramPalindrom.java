//Prime number that are anagram and palindrom 
package com.java;
import java.util.*;
public class PrimeNumberAnagramPalindrom {

	public static void main(String[] args) {
		int start = 0, end = 1000;

	    System.out.println("Prime numbers between " + start + " and " + end + " that are anagram and palindrome:");
	    for (int i = start; i <= end; i++) {
	      if (isPrime(i) && isAnagramPalindrome(i)) {
	        System.out.print(i + " ");
	      }
	    }
	  }

	  private static boolean isPrime(int n) {
	    if (n <= 1) {
	      return false;
	    }

	    for (int i = 2; i <= Math.sqrt(n); i++) {
	      if (n % i == 0) {
	        return false;
	      }
	    }

	    return true;
	  }

	  private static boolean isAnagramPalindrome(int n) {
	    String str = String.valueOf(n);
	    String reverseStr = new StringBuilder(str).reverse().toString();

	    if (str.equals(reverseStr)) {
	      // If the number is a palindrome, check if any of its permutations are prime
	      List<String> permutations = new ArrayList<>();
	      generatePermutations("", str, permutations);
	      for (String perm : permutations) {
	        int permInt = Integer.parseInt(perm);
	        if (isPrime(permInt)) {
	          return true;
	        }
	      }
	    }

	    return false;
	  }

	  private static void generatePermutations(String prefix, String str, List<String> permutations) {
	    int n = str.length();
	    if (n == 0) {
	      permutations.add(prefix);
	    } else {
	      for (int i = 0; i < n; i++) {
	        generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), permutations);
	      }
	    }
	  }
	

	}


