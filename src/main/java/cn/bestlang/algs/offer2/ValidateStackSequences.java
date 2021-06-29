package cn.bestlang.algs.offer2;

import java.util.Deque;
import java.util.LinkedList;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new LinkedList<>();
        int pushIndex = 0;
        int popIndex = 0;
        while(pushIndex < pushed.length || popIndex < popped.length) {
            int pop = popped[popIndex];
            Integer peek = stack.peek();
            if (peek == null || !peek.equals(pop)) {
                if (pushIndex == pushed.length) {
                    return false;
                }
                stack.push(pushed[pushIndex++]);
            } else {
                stack.pop();
                popIndex++;
            }
        }

        return true;
    }
}
