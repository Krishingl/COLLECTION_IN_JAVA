package com.krush.linked_list;

import java.util.*;

public class ArrayList_vs_LinkedList {

	public static void main(String[] args) {

		final int ITERATION = 100000;// 1Lack

		ArrayList<Integer> arrayList = new ArrayList<>();

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < ITERATION; i++) {

			arrayList.add(0,i);
		}
		long endTime = System.currentTimeMillis();

	System.out.println("Total time taken by ArrayList To adding a element in the middel or Begining : " +(endTime-startTime)+" ms");//407 ms
		LinkedList<Integer> linkedList = new LinkedList<>();

		startTime = System.currentTimeMillis();

		for (int i = 0; i < ITERATION; i++) {

			linkedList.add(0,i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Total time taken by LinkedList To adding a element in the middel or Begining : " +(endTime-startTime)+" ms");//9ms
		

	}
}
