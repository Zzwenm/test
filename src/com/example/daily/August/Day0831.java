package com.example.daily.August;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zzwen
 * @date 2020-8-31 9:43
 */
public class Day0831 {

    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> room1 = new ArrayList<>();
        room1.add(1);
        room1.add(3);
        List<Integer> room2 = new ArrayList<>();
        room2.add(3);
        room2.add(0);
        room2.add(1);
        List<Integer> room3 = new ArrayList<>();
        room3.add(2);
        List<Integer> room4 = new ArrayList<>();
        room4.add(0);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        boolean b = canVisitAllRooms(rooms);
        System.out.println(b);
    }

    //[1],[2],[3],[]

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.size() <= 0) {
            return true;
        }
        boolean[] allRoom = new boolean[rooms.size()];
        allRoom[0] = true;
        List<Integer> keys = rooms.get(0);
        keys.add(0);
        toRoom(rooms, keys, allRoom);
        for (boolean to : allRoom) {
            if (!to) {
                return false;
            }
        }
        return true;
    }

    private static void toRoom(List<List<Integer>> rooms, List<Integer> keys, boolean[] allRoom) {
        for (Integer key : keys) {
            if (!allRoom[key]) {
                allRoom[key] = true;
                toRoom(rooms, rooms.get(key), allRoom);
            }
        }
    }
}
