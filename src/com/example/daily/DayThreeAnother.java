package com.example.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Zzwen
 * @date 2020-8-12 13:55
 */
public class DayThreeAnother {
    public String shortestCommonSupersequence(String str1, String str2) {
        return "";
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-3, -2, -1, 0, 0, 1, 2, 3};
        // -2 -1 0 0 1 2
        List<List<Integer>> lists = fourSum(nums, 0);
        System.out.println(lists);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> threeSum = threeSum(i + 1, nums, target - nums[i]);
            if (threeSum == null) {
                continue;
            }
            for (List<Integer> list : threeSum) {
                list.add(nums[i]);
                res.add(list);
            }
        }
        return res.stream().distinct().collect(Collectors.toList());
    }

    private static List<List<Integer>> threeSum(int start, int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = start; i < nums.length; i++) {
            int num = nums[i];
            List<List<Integer>> twoSum = twoSum(i + 1, nums.length - 1, nums, target - num);
            if (twoSum == null) {
                continue;
            }
            for (List<Integer> list : twoSum) {
                list.add(num);
                res.add(list);
            }
        }
        return res;
    }


    private static List<List<Integer>> twoSum(int start, int end, int[] nums, int target) {

        List<List<Integer>> res = null;
        int pre = start;
        int las = end;
        while (pre < las) {
            if (nums[pre] + nums[las] == target) {
                List<Integer> sum = new ArrayList<>(2);
                sum.add(nums[pre]);
                sum.add(nums[las]);
                res = new ArrayList<>();
                res.add(sum);
                List<List<Integer>> twoSum = twoSum(pre + 1, las-1, nums, target);
                if(twoSum!=null){
                    res.addAll(twoSum);
                }
                break;
            } else if (nums[pre] + nums[las] < target) {
                pre++;
            } else {
                las--;
            }
        }
        return res;
    }
}
