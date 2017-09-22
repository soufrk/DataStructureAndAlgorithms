package algorithm.sort;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

public class QuickSortWithLog {
    
    private static int COUNTER;

    public static void main(String[] args) {
	try {
	    System.setOut(new PrintStream("FavourableFilePicker.txt"));
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	int[] arr = {8, 5, 3, 0, 9, 7, 6};
	System.out.println("Input - " + print(arr));
	COUNTER = 0;
	quickSort(arr, 0, arr.length - 1);
	System.out.println("Output - " + print(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
	COUNTER++;
	System.out.println("Iteration: " + COUNTER);
	if (low >= high)
	    return;
	// 1. Find pivot
	int pivotIndex = findPivotIndex(arr, low, high);
	System.out.println("Pivot" + "(" + COUNTER + "):" + arr[pivotIndex]);
	// 2. Sort the left half
	quickSort(arr, low, pivotIndex - 1);
	System.out.println("Left-half" + "(" + COUNTER + "):"+ print(arr));
	// 3. Sort the right half
	quickSort(arr, pivotIndex + 1, high);
	System.out.println("Right-half" + "(" + COUNTER + "):" + print(arr));
    }

    private static int findPivotIndex(int[] arr, int low, int high) {
	// randomly find the pivot element
	int pivotElement = arr[high];
	// move elements smaller to pivot to its left and larger to its right
	int j = low - 1;
	for (int i = low; i < high; i++) {
	    if (arr[i] <= pivotElement) {
		j++;
		swap(arr, i, j);
	    }
	}
	swap(arr, j + 1, high);
	return j + 1;
    }

    private static void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }
    
    private static String print(int[] arr){
	return Arrays.toString(arr);
    }

}
