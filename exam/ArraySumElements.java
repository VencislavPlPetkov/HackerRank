import java.util.Scanner;

/**
 * Given an array of integers, can you find the sum of its elements?
 * 
 * Input Format
 * The first line contains an integer, , denoting the size of the array. The
 * second line contains space-separated integers representing the array's
 * elements.
 * 
 * 
 * Output Format
 * Print the sum of the array's elements as a single integer.
 * 
 * Sample Input
 * 6 1 2 3 4 10 11 
 * 
 * Sample Output
 * 31
 *
 */

public class ArraySumElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nums = sc.nextLine();
		String[] items = sc.nextLine().split(" ");

		int[] results = new int[items.length];

		for (int i = 0; i < items.length; i++) {

			results[i] = Integer.parseInt(items[i]);

		}

		int sum = 0;

		for (int i = 0; i < results.length; i++) {
			sum += results[i];
		}

		System.out.println(sum);

	}

}
