package com.java;

public class PrimeNumberRange {

	public static void main(String[] args) {
		int start = 0, end = 1000;

	    System.out.println("Prime numbers between " + start + " and " + end + " are:");
	    for (int i = start; i <= end; i++) {
	      if (isPrime(i)) {
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
	}

	
