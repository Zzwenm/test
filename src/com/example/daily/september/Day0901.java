package com.example.daily.september;

/**
 * 486. 预测赢家
 * todo one more time
 * [1, 5, 233, 7] true
 * [1, 5, 2] false
 *
 * @author Zzwen
 * @date 2020-9-1 9:17
 */
public class Day0901 {

    //revert test

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 233,7};
        boolean winner = PredictTheWinner(nums);
        System.out.println(winner);
    }

    public static boolean PredictTheWinner(int[] nums) {
        int score = isWinner(nums, 0, nums.length - 1, 1);
        return score>=0;
    }

    private static int isWinner(int[] nums, int l, int r, int round) {
        if(l==r){
            return nums[l];
        }
        if (round == 1) {
            round = 2;
            int left = isWinner(nums, l + 1, r, round) + nums[l];
            int right = isWinner(nums, l, r - 1, round) + nums[r];
            return Math.max(left, right);
        }
        round=1;
        int left = isWinner(nums, l + 1, r, round) - nums[l];
        int right = isWinner(nums, l, r - 1, round) - nums[r];
        return Math.min(left, right);
    }

}
