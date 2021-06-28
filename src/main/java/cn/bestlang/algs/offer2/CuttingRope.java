package cn.bestlang.algs.offer2;

import java.util.HashMap;
import java.util.Map;

public class CuttingRope {

    Map<Integer, Integer> map = new HashMap<>();

    public int cuttingRope(int n) {
        if (n == 1) {
            return 1;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int max = 0;
        for (int i = 1; i < n; i++) {
            int a = i * (n - i);
            int b = i * cuttingRope(n - i);
            max = Math.max(Math.max(a, b), max);
        }
        map.put(n, max);
        return max;
    }


}
