package interviewpreparation;

import java.util.*;

public class P_2 {//Main

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int element : arr) {
            if (element == target) {
                count++;
            }
        }
        return count;
    }

   
    public static int findFirstRepeatingElement(int[] arr) {
        // Use a Set to track elements seen so far for O(1) lookups
        Set<Integer> seen = new HashSet<>();
        for (int element : arr) {
            // If already seen, this is the first repetition
            if (seen.contains(element)) {
                return element;
            }
            seen.add(element);
        }
        // No repeating element found
        return -1;
    }

    /**
     * 3. Find the intersection of the two arrays (i.e., the elements that are common to both arrays).
     */
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        // Use a Set for fast lookups of elements in arr1
        Set<Integer> set1 = new HashSet<>();
        for (int element : arr1) {
            set1.add(element);
        }

        List<Integer> intersection = new ArrayList<>();
        // Use a Set to ensure each common element is added only once to the result
        Set<Integer> addedToIntersection = new HashSet<>();

        for (int element : arr2) {
            // Check if element is common AND has not been added yet
            if (set1.contains(element) && !addedToIntersection.contains(element)) {
                intersection.add(element);
                addedToIntersection.add(element);
            }
        }
        return intersection;
    }

    /**
     * 4. Determine the number of distinct elements in given array.
     */
    public static int countDistinctElements(int[] arr) {
        // A HashSet automatically stores only unique elements
        Set<Integer> distinctElements = new HashSet<>();
        for (int element : arr) {
            distinctElements.add(element);
        }
        return distinctElements.size();
    }

    public static void main(String[] args) {
        // Example usage based on the problem description
        int[] arr1 = {1, 2, 3, 2, 4, 5};
        System.out.println("1. Occurrences of 2: " + countOccurrences(arr1, 2)); // Output: 2

        int[] arr2 = {5, 8, 2, 5, 9, 8, 1};
        System.out.println("2. First repeating element: " + findFirstRepeatingElement(arr2)); // Output: 5

        int[] arrA = {10, 20, 30, 40, 50, 20};
        int[] arrB = {30, 60, 10, 70, 10};
        System.out.println("3. Intersection: " + findIntersection(arrA, arrB)); // Output: [30, 10]

        int[] arr3 = {1, 2, 1, 3, 4, 2, 5, 5, 1};
        System.out.println("4. Distinct elements: " + countDistinctElements(arr3)); // Output: 5
    }
}