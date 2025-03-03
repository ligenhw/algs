package cn.bestlang.algs.lc;

public class Convert {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int columeSize = columeSize(s.length(), numRows);
        char[][] matrix = new char[numRows][columeSize];

        int i = 0;
        int j = 0;
        char[] chars = s.toCharArray();

        boolean rowAdd = true;
        boolean columeAdd = false;
        for (char c : chars) {
            matrix[i][j] = c;

            if (i == numRows - 1) {
                rowAdd = false;
                columeAdd = true;
            } else if (i == 0) {
                rowAdd = true;
                columeAdd = false;
            }

            if (rowAdd) {
                i++;
            } else {
                i--;
            }

            if (columeAdd) {
                j++;
            }
        }

        return matrixToStr(matrix);
    }

    public String matrixToStr(char[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (char[] chars : matrix) {
            for (char c : chars) {
                if (c != 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }

    public int columeSize(int len, int numRows) {
        int total = 0;
        int matrixSize = numRows * 2 - 2;
        int a = len / matrixSize;
        total += a * (numRows - 1);
        int b = len % matrixSize;

        if (b == 0) {
            return total;
        }

        if (b <= numRows) {
            return total + 1;
        }  else {
            return total + b - numRows + 1;
        }
    }
}
