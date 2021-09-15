package cn.bestlang.algs.offer2s;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        boolean addOne = false;
        int i = 0;
        while (i < a.length() || i < b.length()) {
            int subResult = 0;
            if (i < a.length()) {
                int i1 = charToInt(a.charAt(a.length() - i - 1));
                subResult += i1;
            }
            if (i < b.length()) {
                int i2 = charToInt(b.charAt(b.length() - i - 1));
                subResult += i2;
            }
            if (addOne) {
                subResult++;
            }

            if (subResult == 3) {
                addOne = true;
                result.insert(0, '1');
            } else if (subResult == 2) {
                addOne = true;
                result.insert(0, '0');
            } else if (subResult == 1) {
                result.insert(0, '1');
                addOne = false;
            } else {
                result.insert(0, '0');
                addOne = false;
            }

            i++;
        }

        if (addOne) {
            result.insert(0, '1');
        }

        return result.toString();
    }

    private int charToInt(int c) {
        return c - '0';
    }
}
