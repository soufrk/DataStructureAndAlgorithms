package program.integer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Find pairs of numbers in a given array whose sum is equal to a given number
 * 
 * @author skedia
 *
 */
public class PairsEqualSum {

	public static void main(String[] args) {
		Integer[] arr = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int sum = 20;
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		Set<Integer[]> pairSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(sum - arr[i])) {
				Integer[] pair = new Integer[2];
				pair[0] = arr[i];
				pair[1] = sum - arr[i];
				pairSet.add(pair);
				set.remove(pair[0]);
				set.remove(pair[1]);
			}
		}
		for (Integer[] pair : pairSet) {
			System.out.println(Arrays.toString(pair));
		}
	}

}
