package algorithm.sort;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		// unsorted input array
		int[] arr = { 5, 2, 1, 0, 34, 88, 12, 3, 8, 33, 76 };

		arr = radixSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	private static int[] radixSort(int[] arr) {
		// get the max no to know the digit
		int max = getMax(arr);

		// counting sort for each digit in all the places
		for (int i = 1; max / i > 0; i *= 10) {
			arr = countingSort(arr, i);
		}

		return arr;
	}

	private static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
			max = Integer.max(max, arr[i]);
		return max;
	}

	private static int[] countingSort(int[] arr, int i) {
		int[] cArray = new int[10];
		Arrays.fill(cArray, 0);
		int[] oArray = new int[arr.length];
		Arrays.fill(oArray, 0);	

		for (int j = 0; j < arr.length; j++) {
			++cArray[(arr[j]/i)%10];
		}
		System.out.println(Arrays.toString(cArray));

		for (int j = 1; j < cArray.length; j++) {
			cArray[j] += cArray[j - 1];
		}
		System.out.println(Arrays.toString(cArray));

		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.println(arr[j]);
			System.out.println((arr[j]/i)%10 - 1);
			oArray[cArray[(arr[j]/i)%10] - 1] = arr[j];
			cArray[(arr[j]/i)%10] -= 1;
		}
		System.out.println(Arrays.toString(oArray));
		return oArray;
	}

}
