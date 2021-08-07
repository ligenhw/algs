package cn.bestlang.algs.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Permute {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        /**
         * 通过数组保存是否访问过 标记
         */
        boolean[] visited = new boolean[nums.length];
        /**
         * 递归 通过系统栈 保存每一步的状态。
         * path 保存递归的路径， 所以可以使用 stack。与递归过程同步。
         */
        Deque<Integer> path = new LinkedList<>();

        dfs(nums, 0, result, path, visited);

        return result;
    }

    private void dfs(int[] nums, int index, List<List<Integer>> result, Deque<Integer> path, boolean[] visited) {
        /**
         * 如何判断条件是 index == nums.length - 1 则需要add最后一个元素。
         * index == nums.length ，可以将add元素放在上一次迭代。
         */
        if (index == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        /**
         * 此处递归多次 ， 对应于回溯树形结构 的多个子节点分支。
         */
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                path.push(nums[i]);
                visited[i] = true;

                dfs(nums, index + 1, result, path, visited);

                path.pop();
                visited[i] = false;
            }
        }
    }
}
