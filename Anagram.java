package com.java;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter First String");
		    String str1 = sc.next();
		    System.out.println("Enter Second String");
		    String str2 = sc.next();
		    boolean result = isAnagram(str1, str2);
		    if (result) {
		      System.out.println(str1 + " and " + str2 + " are anagrams.");
		    } else {
		      System.out.println(str1 + " and " + str2 + " are not anagrams.");
		    }
		  }

		  public static boolean isAnagram(String str1, String str2) {
		    if (str1.length() != str2.length()) {
		      return false;
		    }
		    char[] charArr1 = str1.toCharArray();
		    char[] charArr2 = str2.toCharArray();
		    Arrays.sort(charArr1);
		    Arrays.sort(charArr2);
		    return Arrays.equals(charArr1, charArr2);
		  }
		}

	
