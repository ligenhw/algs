package cn.bestlang.algs.offer2s;

public class MaxProduct {
    public int maxProduct(String[] words) {
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int subMax = 0;
            for (int j = i + 1; j < words.length; j++) {
                boolean b = hasSameChar(word, words[j]);
                if (!b) {
                    subMax = Math.max(subMax, word.length() * words[j].length());
                }
            }

            max = Math.max(max, subMax);
        }
        return max;
    }

    public boolean hasSameChar(String w1, String w2) {
        int i1 = toBinary(w1);
        int i2 = toBinary(w2);
        return (i1 & i2) != 0;
    }

    public int toBinary(String word) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            result |= 1 << binaryIndex(word.charAt(i));
        }

        return result;
    }

    public int binaryIndex(char c) {
        return c - 'a';
    }
}
