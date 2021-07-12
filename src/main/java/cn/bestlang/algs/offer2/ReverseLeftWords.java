package cn.bestlang.algs.offer2;

public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        String first = s.substring(0, n);
        String last = s.substring(n);

        return last + first;
    }
}
