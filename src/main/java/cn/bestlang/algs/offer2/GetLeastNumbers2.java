package cn.bestlang.algs.offer2;

public class GetLeastNumbers2 {

    int[] heap;
    int i;
    int k;

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k < 1) {
            return new int[]{};
        }

        heap = new int[k + 1];
        this.k = k;
        i = 1;

        for (int num : arr) {
            if (i <= k) {
                heap[i++] = num;
                swim(i - 1);
            } else {
                checkOrSink(num);
            }
        }

        int[] result = new int[k];
        System.arraycopy(heap, 1, result, 0, k);

        return result;
    }

    private void checkOrSink(int num) {
        if (num > heap[1]) return;

        heap[1] = num;
        sink(1);
    }

    private void sink(int i) {
        while (i <= k / 2) {
            int j = i * 2;
            int jn = heap[j];
            if (j + 1 <= k && heap[j + 1] > jn) {
                jn = heap[j + 1];
                j += 1;
            }

            if (heap[i] < jn) {
                change(i, j);
                i = j;
            } else {
                break;
            }
        }
    }

    private void swim(int i) {
        while (i > 1) {
            if (heap[i] > heap[i / 2]) {
                change(i, i / 2);
                i /= 2;
            } else {
                break;
            }
        }
    }

    private void change(int i, int j) {
        int t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;
    }

}
