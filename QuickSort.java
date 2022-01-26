package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter space separated values for the array: ");
		String[] s = in.nextLine().split(" ");
		List<Integer> list = new ArrayList<>();

		for (String elem : s) {
			try {
				int x = Integer.parseInt(elem);
				list.add(x);
			} catch (Exception e) {
				System.out.println("Element: " + elem + " cannot be cast as a number");
				e.printStackTrace();
				System.exit(1);
			}
		}
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		QuickSort sorter = new QuickSort();
		sorter.quicksort(array, 0, array.length - 1);
		System.out.println(java.util.Arrays.toString(array));
	}

	private void quicksort(int[] array, int start, int end) {
		if (start < end) {

			int pivotIndex = partition(array, start, end);
			quicksort(array, start, pivotIndex);

			quicksort(array, pivotIndex + 1, end);
		}
	}

	private int partition(int[] array, int start, int end) {
		int pivotIndex = (start + end) / 2;
		int pivot = array[pivotIndex];
		start--;
		end++;

		while (true) {
			do
				start++;
			while (array[start] < pivot);

			do
				end--;
			while (array[end] > pivot);

			if (start >= end)
				return end;

			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
		}

	}
}
