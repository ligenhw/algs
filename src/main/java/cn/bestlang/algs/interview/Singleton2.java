package cn.bestlang.algs.interview;

public class Singleton2 {

    private static class SingletonHolder {
        private static final Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
