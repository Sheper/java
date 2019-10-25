package com.pp.javatpoint.array;

import java.util.*;

public class SmallestInArrayExample1 {
	public static int getSmallest(int[] a, int total) {
		Arrays.sort(a);
		return a[0];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Smallest: " + getSmallest(a, 6));
		System.out.println("Smallest: " + getSmallest(b, 7));
	}
}
