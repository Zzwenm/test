package com.example.daily;

/**
 * 546. 移除盒子
 * 困难
 * 1111
 * 动态规划
 *
 * @author Zzwen
 * @date 2020-8-15 14:57
 */
 @Sl4j
public class DaySix {

    //[1,3,2,2,2,3,4,3,1]

    public int removeBoxes(int[] boxes) {
        int[] res = new int[boxes.length];
		int x = 0;
        res[0] = 1;
        for (int i = 1; i < boxes.length; i++) {
            if (boxes[i] == boxes[i - 1]) {

            }
        }
		if(true){
			log.info("111");
		}
        return 0;
    }

}
