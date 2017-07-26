package algorithm.sort.variations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortStringArrayUsingCountingSort {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		Map<StringBuilder, Boolean> map = new HashMap<>();
		StringBuilder[] sArr = new StringBuilder[n];
		int[] iArr = new int[n];
		for (int i = 0; i < n; i++) {
			String[] temp = in.readLine().split(" ");
			iArr[i] = Integer.parseInt(temp[0]);
			sArr[i] = new StringBuilder(temp[1]);
			if (i < n / 2)
				map.put(sArr[i], false);
			else
				map.put(sArr[i], false);
		}

		int[] cArr = new int[100];
		Arrays.fill(cArr, 0);
		for (int i = 0; i < iArr.length; i++)
			cArr[iArr[i]]++;

		for (int i = 1; i < cArr.length; i++) {
			cArr[i] += cArr[i - 1];
		}

		StringBuilder[] oArr = new StringBuilder[n];
		for (int i = oArr.length - 1; i >= 0; i--) {
			oArr[cArr[iArr[i]] - 1] = sArr[i];
			cArr[iArr[i]]--;
		}

		StringBuilder oStr = new StringBuilder();

		for (int i = 0; i < oArr.length; i++) {
			if (!map.get(oArr[i]))
				oStr.append("- ");
			else
				oStr.append(oArr[i] + " ");
		}
		System.out.print(oStr);
	}
}
