package cn.bestlang.algs.interview;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class CanLogin {

    private ConcurrentHashMap<Integer, LinkedList<Long>> maps = new ConcurrentHashMap<>();

    public boolean canLogin(int uid) {
        long ts = System.currentTimeMillis();

        LinkedList<Long> linkedList = maps.computeIfAbsent(uid, a -> {
            LinkedList<Long> list = new LinkedList<>();
            list.add(ts);
            return list;
        });

        synchronized (linkedList) {
            while (!linkedList.isEmpty()) {
                Long firstTs = linkedList.getFirst();
                if (ts - firstTs > 60000) {
                    linkedList.removeFirst();
                } else {
                    break;
                }
            }

            if (linkedList.size() < 5) {
                linkedList.add(ts);
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
