package com.example.daily;

import java.util.Arrays;

/**
 * 733. 图像渲染
 *
 * @author Zzwen
 * @date 2020-8-16 16:13
 */
public class DaySeven {

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] ints = floodFill(image, 1, 1, 2);
        System.out.println(Arrays.asList(ints));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        doFloodFill(image, sr, sc, newColor, image[sr][sc], new boolean[image.length][image[0].length]);
        return image;
    }

    private static void doFloodFill(int[][] image, int x, int y, int newColor, int src, boolean[][] visited) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length || visited[x][y] || image[x][y] != src) {
            return;
        }
        visited[x][y] = true;
        image[x][y] = newColor;
        //shang
        doFloodFill(image, x - 1, y, newColor, src, visited);
        //xia
        doFloodFill(image, x + 1, y, newColor, src, visited);
        //zuo
        doFloodFill(image, x, y - 1, newColor, src, visited);
        //you
        doFloodFill(image, x, y + 1, newColor, src, visited);
    }

}
