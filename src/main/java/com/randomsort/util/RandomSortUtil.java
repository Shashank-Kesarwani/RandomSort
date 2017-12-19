/**
 * 
 */
/**
 * @author shashank
 *
 */
package com.randomsort.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import com.randomsort.model.NumberSortModel;

public class RandomSortUtil {
	public static ArrayList<Integer> stringToArrayList(String numberVal) {
		int[] ints = Arrays.stream(numberVal.split(",")).mapToInt(Integer::parseInt).toArray();

		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(ints).boxed().collect(Collectors.toList());

		return list;
	}

	public static void bogo(ArrayList<Integer> arr, NumberSortModel numberSort) {
		// Keep a track of the number of shuffles
		int shuffle = 1;
		for (; !isSorted(arr); shuffle++)
			shuffle(arr);
		// Boast
		numberSort.setPositionChanged(shuffle);
		System.out.println("This took " + shuffle + " shuffles.");
		display1D(arr);
		numberSort.setOutputParamAsArrayList(arr);
	}

	static void shuffle(ArrayList<Integer> arr) {
		// Standard Fisher-Yates shuffle algorithm
		int i = arr.size() - 1;
		while (i > 0)
			swap(arr, i--, (int) (Math.random() * i));
	}

	static void swap(ArrayList<Integer> arr, int i, int j) {
		int temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}

	static boolean isSorted(ArrayList<Integer> arr) {

		// for(Integer number : arr){
		//
		// }
		for (int i = 1; i < arr.size(); i++)
			if (arr.get(i) < arr.get(i - 1)) {
				return false;
			}
		return true;

	}
	static void display1D(ArrayList<Integer> arr)
	{
		
			System.out.print(arr);
		
	}
	public static NumberSortModel prepareNumberSortBean(NumberSortModel numSort) {
		
		NumberSortModel noSort = new NumberSortModel();
		noSort.setId(numSort.getId());
		noSort.setInputParam(numSort.getInputParam());
		noSort.setOutputParam(numSort.getOutputParam());
		noSort.setTimeConsumed(numSort.getTimeConsumed());
		noSort.setPositionChanged(numSort.getPositionChanged());
		
		return noSort;

	}
	

}