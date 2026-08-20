import java.util.*;

class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        // Step 1: first two operations
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        // Step 2: remaining operations
        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        // Step 3: concatenate arr1 + arr2
        int[] result = new int[arr1.size() + arr2.size()];
        int idx = 0;
        for (int x : arr1) result[idx++] = x;
        for (int x : arr2) result[idx++] = x;

        return result;
    }
}
