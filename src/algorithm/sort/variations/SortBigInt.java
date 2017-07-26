package algorithm.sort.variations;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class SortBigInt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger[] bIArray = new BigInteger[n];
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			bIArray[unsorted_i] = new BigInteger(in.next());
		}

		BigInteger m = getMax(bIArray);

		for (BigInteger i = new BigInteger("1"); m.divide(i)
				.compareTo(new BigInteger("0")) == 1; i = i.multiply(new BigInteger("10"))) {
			bIArray = sort(bIArray, i);
		}

		for (int i = 0; i < n; i++)
			System.out.println(bIArray[i]);
		in.close();
	}

	public static BigInteger[] sort(BigInteger[] arr, BigInteger j) {
		BigInteger[] cArray = new BigInteger[10];
		BigInteger[] oArray = new BigInteger[arr.length];

		Arrays.fill(cArray, new BigInteger("0"));
		Arrays.fill(oArray, new BigInteger("0"));

		for (int i = 0; i < arr.length; i++){
			cArray[(arr[i].divide(j)).remainder(new BigInteger("10")).intValue()] = cArray[(arr[i].divide(j)).remainder(new BigInteger("10")).intValue()]
					.add(new BigInteger("1"));
		}

		for (int i = 1; i < cArray.length; i++)
			cArray[i] = cArray[i].add(cArray[i - 1]);

		for (int i = arr.length - 1; i >= 0; i--) {
			oArray[cArray[(arr[i].divide(j)).remainder(new BigInteger("10")).intValue()].intValue() - 1] = arr[i];
			cArray[(arr[i].divide(j)).remainder(new BigInteger("10")).intValue()] = cArray[(arr[i].divide(j)).remainder(new BigInteger("10")).intValue()]
					.subtract(new BigInteger("1"));
		}

		System.out.println(Arrays.toString(oArray));
		return oArray;
	}

	public static BigInteger getMax(BigInteger[] arr) {
		BigInteger a = new BigInteger(String.valueOf(Integer.MIN_VALUE));
		for (int i = 0; i < arr.length; i++)
			if (a.compareTo(arr[i]) == -1)
				a = arr[i];
		return a;
	}

	public static void swap(BigInteger[] arr, int i, int j) {
		BigInteger tI = arr[i];
		arr[i] = arr[j];
		arr[j] = tI;
	}
}
