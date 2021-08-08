package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    void get() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);

        System.out.println(cache);
    }
}