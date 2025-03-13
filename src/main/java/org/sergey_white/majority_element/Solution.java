package org.sergey_white.majority_element;

import java.util.HashMap;
import java.util.Map;

/**
 Given an array nums of size n, return the majority element.
 The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
 always exists in the array.

 Example 1:
 Input: nums = [3,2,3]
 Output: 3

 Example 2:
 Input: nums = [2,2,1,1,1,2,2]
 Output: 2
**/

public class Solution {

    public  int majorityElement1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int val = 0;
        int maxCount = 0;
        for (int num : nums) {
            int countNum = map.getOrDefault(num, 0);
            countNum++;
            if (countNum > maxCount) {
                maxCount = countNum;
                val = num;
            }
            map.put(num, countNum);
        }
        return val;
    }
    public  int majorityElement2(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}




