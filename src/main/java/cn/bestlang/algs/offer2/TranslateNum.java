package cn.bestlang.algs.offer2;

public class TranslateNum {
    public int translateNum(int num) {
        int max = 25;
        int n = num / 10;
        int first = num % 10;
        int count = 1;
        int singleFirst = 1; // 开头1位数 个数
        while (n > 0) {
            int current = n % 10;
            int number = getNumber(first, current);
            int oldCount = count;
            if (number <= max && current != 0) {
                count += singleFirst;
            }

            n /= 10;
            first = current;
            singleFirst = oldCount;
        }

        return count;
    }

    private int getNumber(int first, int current) {
        return current * 10 + first;
    }
}
