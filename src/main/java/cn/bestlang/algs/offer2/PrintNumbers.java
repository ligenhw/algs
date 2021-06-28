package cn.bestlang.algs.offer2;

import java.util.Objects;

public class PrintNumbers {
    public int[] printNumbers(int n) {
        double max = Math.pow(10, n) - 1;
        int[] result = new int[(int)max];
        for (int i = 0; i < max; i++) {
            result[i] = i + 1;
        }

        return result;
    }

    public void printNumbers2(int n) {
        BigNum bigNum = new BigNum(n);
        BigNum i = new BigNum();
        while(!i.equals(bigNum)) {
            System.out.println(i);
            i.addOne();
        }
        System.out.println(i);
    }

    static class BigNum {
        static char[] digit = {'0', '1', '2', '3', '4','5', '6', '7', '8', '9'};

        String num = "0";

        public BigNum() {
        }

        public BigNum(int n) {
            String result = "";
            for (int i = 0; i < n; i++) {
                result += "9";
            }
            num = result;
        }

        void addOne() {
            num = add(num);
        }

        String add(String num) {
            if (num.length() == 0) {
                return "1";
            }

            int length = num.length();
            char last = num.charAt(length - 1);
            int add = last - '0' + 1;
            if (add < 10) {
                return num.substring(0, length - 1) + digit[add];
            } else {
                return add(num.substring(0, length - 1)) + '0';
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BigNum bigNum = (BigNum) o;
            return Objects.equals(num, bigNum.num);
        }

        @Override
        public int hashCode() {
            return Objects.hash(num);
        }

        @Override
        public String toString() {
            return num;
        }
    }
}
