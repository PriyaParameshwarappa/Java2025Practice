import java.util.*;

public class P_1 {

	public static int findOccurrences(int[] array, int target) {
		int count = 0;
		for (int element : array) {
			if (element == target) {
				count++;
			}
		}
		return count;
	}

	public static int findFirstDuplicate(int[] array) {

		Set<Integer> seen = new HashSet<>();

		for (int element : array) {

			if (seen.contains(element)) {
				return element;
			}

			seen.add(element);
		}

		return -1;
	}

	public static List<Integer> findIntersection(int[] array1, int[] array2) {

		Set<Integer> set1 = new HashSet<>();
		for (int element : array1) {
			set1.add(element);
		}

		List<Integer> intersection = new ArrayList<>();

		for (int element : array2) {

			if (set1.contains(element) && !intersection.contains(element)) {
				intersection.add(element);
			}
		}

		return intersection;
	}

	public static int countDistinctElements(int[] array) {

		Set<Integer> distinctElements = new HashSet<>();

		for (int element : array) {
			distinctElements.add(element);
		}

		return distinctElements.size();
	}

	public static void main(String[] args) {

		int[] arrayR1 = { 1, 2, 3, 2, 4, 5 };
		int targetR1 = 2;

		System.out.println(Arrays.toString(arrayR1) + targetR1);
		System.out.println(findOccurrences(arrayR1, targetR1));

		int[] arrayR2 = { 10, 5, 3, 4, 3, 5, 6 };

		System.out.println(Arrays.toString(arrayR2));
		System.out.println(findFirstDuplicate(arrayR2));

		int[] arrayR3_A = { 1, 2, 3, 4, 5, 5 };
		int[] arrayR3_B = { 3, 5, 7, 9, 1 };

		System.out.println(Arrays.toString(arrayR3_A));
		System.out.println(Arrays.toString(arrayR3_B));
		System.out.println(findIntersection(arrayR3_A, arrayR3_B));

		int[] arrayR4 = { 1, 2, 2, 3, 4, 4, 4, 5, 1 };

		System.out.println(Arrays.toString(arrayR4));
		System.out.println(countDistinctElements(arrayR4));

	}
}