package com.example.daily.August;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 332. 重新安排行程
 * @author Zzwen
 * @date 2020-8-27 16:02
 */
public class Day0827 {

    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
        List<String> ticket = new ArrayList<>(2);
        ticket.add("JFK");
        ticket.add("SFO");
        tickets.add(ticket);
        List<String> ticket2 = new ArrayList<>(2);
        ticket2.add("JFK");
        ticket2.add("ATL");
        tickets.add(ticket2);
        List<String> ticket3 = new ArrayList<>(2);
        ticket3.add("SFO");
        ticket3.add("ATL");
        tickets.add(ticket3);
        List<String> ticket4 = new ArrayList<>(2);
        ticket4.add("ATL");
        ticket4.add("JFK");
        tickets.add(ticket4);
        List<String> ticket5 = new ArrayList<>(2);
        ticket5.add("ATL");
        ticket5.add("SFO");
        tickets.add(ticket5);
        List<String> itinerary = findItinerary(tickets);
        System.out.println(itinerary);
    }
    public static List<String> findItinerary(List<List<String>> tickets) {
        List<String> res;
        List<String> allPlaces = new ArrayList<>(tickets.size()+1);
        Map<String, List<String>> tickMap = new HashMap<>();
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            allPlaces.add(to);
            List<String> list = tickMap.get(from);
            if (list == null) {
                List<String> place = new ArrayList<>(1);
                place.add(to);
                tickMap.put(from, place);
            } else {
                list.add(to);
                list.sort(Comparator.naturalOrder());
                tickMap.put(from, list);
            }
        }
        allPlaces.add("JFK");
        res = helper("JFK", tickMap, allPlaces);
        return res;
    }

    // JFK ATL JFK SFO ATL SFO
    //["JFK","ANU","EZE","AXA","TIA","ANU","JFK","ANU","TIA","JFK","TIA"]
    //["JFK","ANU","EZE","AXA","TIA","ANU","JFK","TIA","ANU","TIA","JFK"]
    private static List<String> helper(String currentStation, Map<String, List<String>> tickMap, List<String> allPlaces) {
        List<String> runPath = new ArrayList<>();
        runPath.add(currentStation);
        if(!allPlaces.contains(currentStation)){
            return null;
        }
        if(allPlaces.size()==1){
            return runPath;
        }
        List<String> places = new ArrayList<>(allPlaces);
        places.remove(currentStation);
        List<String> toList = tickMap.get(currentStation);
        if(toList==null){
            return null;
        }
        for (String to : toList) {
            Map<String,List<String>> newMap = new HashMap<>(tickMap);
            List<String> newToList = new ArrayList<>(toList);
            newToList.remove(to);
            newMap.put(currentStation,newToList);
            List<String> toPath = helper(to, newMap, places);
            if (toPath != null) {
                runPath.addAll(toPath);
                return runPath;
            }
        }
        return null;
    }
}
