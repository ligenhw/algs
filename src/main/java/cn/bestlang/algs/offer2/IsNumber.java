package cn.bestlang.algs.offer2;

public class IsNumber {
    public boolean isNumber(String s) {
        String num = s.trim();
        if (num.isEmpty()) {
            return false;
        }

        StringIndex si = new StringIndex(num);

        boolean numeric = scanInteger(si);

        if (si.hasNext() && si.s.charAt(si.i) == '.') {
            si.i++;
            numeric = scanUnsignedInteger(si) || numeric;
        }

        if (si.hasNext() && (si.s.charAt(si.i) == 'e' || si.s.charAt(si.i) == 'E')) {
            si.i++;

            numeric = numeric && scanInteger(si);
        }

        return numeric && si.s.length() == si.i;
    }

    private boolean scanInteger(StringIndex si) {
        String num = si.s;
        if (si.hasNext() && (num.charAt(si.i) == '+' || num.charAt(si.i) == '-')) {
            si.i++;
        }

        return scanUnsignedInteger(si);
    }

    private boolean scanUnsignedInteger(StringIndex si) {
        int index = si.i;
        String num = si.s;
        while(si.i < num.length() && num.charAt(si.i) >= '0' && num.charAt(si.i) <= '9') {
            si.i++;
        }
        return si.i > index;
    }

    static class StringIndex {
        String s;
        int i;

        public StringIndex(String s) {
            this.s = s;
        }

        boolean hasNext() {
            return i < s.length();
        }
    }
}
