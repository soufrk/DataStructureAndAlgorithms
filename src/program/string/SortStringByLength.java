package program.string;

import java.util.Arrays;

/**
 * Sort a given array of strings based on their length.
 * 
 * @author skedia
 *
 */
public class SortStringByLength {

	public static void main(String[] args) {
		// Input String array
		String[] sArray = { "Ant", "Bear", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse" };
		// Input String Array length Array
		Integer[] lArray = new Integer[sArray.length];
		// Fill Input String Array length Array
		for (int i = 0; i < sArray.length; i++) {
			lArray[i] = sArray[i].length();
		}
		// sort the input string array based on length using quicl sort
		sortArray(lArray, sArray, 0, sArray.length - 1);
		System.out.println(Arrays.toString(sArray));
	}

	private static void sortArray(Integer[] lArray, String[] sArray, int low, int high) {
		if (low >= high)
			return;
		// Find pivot index
		int pIndex = pivot(lArray, sArray, low, high);
		// Sort left sub-array
		sortArray(lArray, sArray, low, pIndex - 1);
		// Sort right sub-array
		sortArray(lArray, sArray, pIndex + 1, high);
	}

	public static int pivot(Integer[] lArray, String[] sArray, int low, int high) {
		// take the pivot element as the element at high index
		int pivot = lArray[high];
		int j = low - 1;
		// move all the elements less than equal to the pivot element towards
		// the left of pivot element
		for (int i = low; i < high; i++) {
			if (lArray[i] <= pivot) {
				// swap elements of lArray and same indexed elements in sArray
				swap(lArray, i, ++j);
				swap(sArray, i, j);
			}
		}
		// swap the pivot element and the element at the high index
		swap(lArray, ++j, high);
		swap(sArray, j, high);
		// return pivot index.
		return j;

	}

	private static <T> void swap(T[] lArray, int i, int j) {
		T temp = lArray[i];
		lArray[i] = lArray[j];
		lArray[j] = temp;
	}

}
