package com.example.daily.August;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Zzwen
 * @date 2020-8-25 10:17
 */
public class Day16 {
    public static void main(String[] args) {
        int[] a = new int[]{4,6,7,7};
        List<List<Integer>> subsequences = findSubsequences(a);
        System.out.println(subsequences);
    }

    // 1 3      13
    // 1 3 4    1,3; 1,4; 3,4; 1,3,4
    // 1 3 4 5  1,3; 1,4; 3,4; 1,3,4; 1,3,5; 1,4,5; 3,4,5; 1,3,4,5; 1,5 3,5 4,5

    public static List<List<Integer>> findSubsequences(int[] nums) {
        if(nums.length<2){
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> fir = new ArrayList<>(2);
        fir.add(nums[0]);
        fir.add(nums[1]);
        res.add(fir);
        for (int i = 2; i < nums.length; i++) {
            List<List<Integer>> copyRes = new ArrayList<>(res);
            for (List<Integer> copyRe : copyRes) {
                List<Integer> tmp = new ArrayList<>(copyRe);
                tmp.add(nums[i]);
                res.add(tmp);
            }
            for (int j = 0; j < i; j++) {
                List<Integer> two = new ArrayList<>(2);
                two.add(nums[j]);
                two.add(nums[i]);
                res.add(two);
            }
        }
        return res.stream().distinct().collect(Collectors.toList());
    }
}
