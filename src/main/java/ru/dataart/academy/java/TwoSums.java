package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        for (int num: nums) {
            int searchInt = target - num;
            int initIndex = 0;
            int finalIndex = nums.length - 1;
            int midIndex;
            while (initIndex <= finalIndex) {
                midIndex = (initIndex + finalIndex) / 2;
                if (nums[midIndex] == searchInt) {
                    return new int[]{num, searchInt};
                } else if (nums[midIndex] < searchInt) {
                    initIndex = midIndex + 1;
                } else if (nums[midIndex] > searchInt) {
                    finalIndex = midIndex - 1;
                }
            }
        }

        return new int[]{};
    }
}
