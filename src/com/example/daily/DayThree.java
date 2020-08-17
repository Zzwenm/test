package com.example.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 133. 克隆图
 * 递归每个相邻节点
 *
 * @author Zzwen
 * @date 2020-8-12 9:28
 */
public class DayThree {

    public static void main(String[] args) {
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Integer, Node> visited = new HashMap<>(100);
        return copyNode(node, visited);
    }

    private Node copyNode(Node node, Map<Integer, Node> visited) {
        Node res = new Node(node.val);
        visited.put(node.val, res);
        ArrayList<Node> neighborNodeList = new ArrayList<>(node.neighbors.size());
        node.neighbors.forEach(item -> {
            if (visited.get(item.val) != null) {
                neighborNodeList.add(visited.get(item.val));
            } else {
                Node neighborNode = copyNode(item, visited);
                neighborNodeList.add(neighborNode);
            }
        });
        res.neighbors = neighborNodeList;
        return res;
    }

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
