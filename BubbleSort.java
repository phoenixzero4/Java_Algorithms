package sorting;

public class BubbleSort {
	public static void main(String[] args) {

		// System.out.println("Enter how many numbers in the array: ");
		// Scanner in = new Scanner(System.in);

		// int n = in.nextInt();
		// System.out.println("Enter the first number: ");
		// int x = in.nextInt();
		int n = 10;
		int x = 25;
		int[] arr = new int[n];
		arr[0] = x;

		for (int i = 1; i < n; i++) {
			// System.out.println("Enter the next number: ");
			// x = in.nextInt();
			x = (int) Math.floor(Math.random() * 50);
			arr[i] = x;
		}

		String ans = "Array: [";
		for (int i = 0; i < arr.length; i++) {
			ans += "" + arr[i] + ", ";
		}
		ans = ans.substring(0, ans.length() - 2);
		ans += "]";
		System.out.println(ans);
		sort(arr);
		printArray(arr);
	}

	public static void sort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					System.out.println("Swapping " + a[j] + " and " + a[i]);
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					System.out.println("a[" + i + "] is now: " + a[i] + " and a[" + j + "] is now: " + a[j]);
				}
			}
			printArray(a);
			System.out.println();
		}
		printArray(a);
	}

	public static void printArray(int[] a) {
		String ans = "[ ";
		for (int i = 0; i < a.length; i++) {
			ans += a[i] + ", ";
		}
		ans = ans.substring(0, ans.length() - 2);
		ans += "]";
		System.out.println(ans);
	}
}
