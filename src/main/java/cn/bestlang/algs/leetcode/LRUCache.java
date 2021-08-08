package cn.bestlang.algs.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private int cap;
    private LinkedHashMap<Integer, Integer> maps;

    public LRUCache(int capacity) {
        cap = capacity;
        maps = new LinkedHashMap<Integer, Integer>(cap, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > cap;
            }
        };
    }

    public int get(int key) {
        return maps.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        maps.put(key, value);
    }
}
