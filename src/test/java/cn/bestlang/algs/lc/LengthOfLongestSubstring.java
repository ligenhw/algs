package cn.bestlang.algs.lc;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    /**
     * 这种滑动窗口的模板题。这是最简单的模板，拿走不谢。 模板：
     *
     * //外层循环扩展右边界，内层循环扩展左边界
     * for (int l = 0, r = 0 ; r < n ; r++) {
     * 	//当前考虑的元素
     * 	while (l <= r && check()) {//区间[left,right]不符合题意
     *         //扩展左边界
     *     }
     *     //区间[left,right]符合题意，统计相关信息
     * }
     * 本题：
     *
     * class Solution {
     *     public int lengthOfLongestSubstring(String s) {
     *         //滑动窗口
     *         char[] ss = s.toCharArray();
     *         Set<Character> set = new HashSet<>();//去重
     *         int res = 0;//结果
     *         for(int left = 0, right = 0; right < s.length(); right++) {//每一轮右端点都扩一个。
     *             char ch = ss[right];//right指向的元素，也是当前要考虑的元素
     *             while(set.contains(ch)) {//set中有ch，则缩短左边界，同时从set集合出元素
     *                 set.remove(ss[left]);
     *                 left++;
     *             }
     *             set.add(ss[right]);//别忘。将当前元素加入。
     *             res = Math.max(res, right - left + 1);//计算当前不重复子串的长度。
     *         }
     *         return res;
     *     }
     * }
     *
     *
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int p1 = 0;
        int p2 = 0;
        Set<Character> sets = new HashSet<>();
        int max = 0;

        while (p2 <= chars.length - 1) {
            char current = chars[p2];
            if (!sets.contains(current)) {
                int len = p2 - p1 + 1;
                max = Math.max(len, max);
                sets.add(current);
            } else {
                while (p1 <= p2) {
                    if (chars[p1] == current) {
                        p1++;
                        break;
                    }
                    sets.remove(chars[p1]);
                    p1++;
                }
            }

            p2++;
        }
        return max;
    }
}
