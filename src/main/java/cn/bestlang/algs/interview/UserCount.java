package cn.bestlang.algs.interview;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 5G 文件
 * 文件格式 userId 正整数
 * 2019-09-01 09:56:00 123 https://www.kuaishou.com/index
 * jvm 4G
 */
public class UserCount {

    public void userCount(File file) throws IOException {
        Map<Integer, Integer> userCountMap = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Integer userId = getUserIdFromLine(line);
                if (userId == -1) {
                    continue;
                }
                if (userCountMap.containsKey(userId)) {
                    userCountMap.put(userId, userCountMap.get(userId) + 1);
                } else {
                    userCountMap.put(userId, 1);
                }
            }

            printUserCount(userCountMap);
        }
    }

    private void printUserCount(Map<Integer, Integer> userCountMap) {
        for (Map.Entry<Integer, Integer> entry : userCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private Integer getUserIdFromLine(String line) {
        String[] strings = line.split(" ");
        if (strings.length < 3) {
            return -1;
        }

        return Integer.valueOf(strings[2]);
    }
}
