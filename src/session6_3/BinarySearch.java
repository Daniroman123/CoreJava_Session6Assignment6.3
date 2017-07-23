/*Write a program to search an element in one-dimensional array
using Binary Search Algorithm*/

package session6_3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner to take input from the user

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the size of the integer array");
		int size = scanner.nextInt();
		int[] binary = new int[size];
		System.out.println("Please enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			binary[i] = scanner.nextInt();
		}

		System.out.println("Enter the element to search");
		int element = scanner.nextInt();

		// Pre-requisite for binary search is a sorted array

		Arrays.sort(binary);
		for (int i = 0; i < binary.length; i++) {
			System.out.println(binary[i]);

		}

		int result = searchElement(binary, element);
		if (result == -1) {
			System.out.println("Element is not found");
		} else {
			System.out.println("Element found at position " + result);
		}
	}

	// Method to search the specific element in the array

	private static int searchElement(int[] binary, int element) {

		int start = 0;
		int end = binary.length - 1;
		do {
			int mid = (start + end) / 2;
			if (element == binary[mid]) {

				return mid;
			}
			if (element < binary[mid]) {

				end = end - 1;
			}
			if (element > binary[mid]) {
				start = start + 1;
			}

		} while (start <= end);
		return -1;
	}

}
