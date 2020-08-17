package com.example.daily;

/**
 * 546. 移除盒子
 * 困难
 *
 * @author Zzwen
 * @date 2020-8-15 14:57
 */
public class DaySix {

    //[1,3,2,2,2,3,4,3,1]

    public int removeBoxes(int[] boxes) {
        int[] res = new int[boxes.length];
        res[0] = 1;
        for (int i = 1; i < boxes.length; i++) {
            if(boxes[i] == boxes[i-1]){

            }
        }
        return 0;
    }

}
