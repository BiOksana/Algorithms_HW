package lesson10;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {
    public static void main(String[] args) {

        // work with unsorted array
        int[] array = {7, 11, 23, 45, 3, 6, 4, 12, 5};
        int value = 9;

        Map<Integer, Integer> digitWithIndexMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int key = value - array[i];
            if (digitWithIndexMap.containsKey(array[i])) {
                System.out.println(digitWithIndexMap.get(array[i]) + " " + i);
            }
            digitWithIndexMap.put(key, i);
        }

        // work with sorted array

        int[] sortedArray = {3, 4, 6, 7, 11, 23, 45};
        int left = 0;
        int right = sortedArray.length - 1;

        while (left < right && sortedArray[left] + sortedArray[right] != value) {
            if (sortedArray[left] + sortedArray[right] > value) {
                right--;
            }
            if (sortedArray[left] + sortedArray[right] < value) {
                left++;
            }
        }
        System.out.println("indexes are : " + left + " & " + right);
    }
}
