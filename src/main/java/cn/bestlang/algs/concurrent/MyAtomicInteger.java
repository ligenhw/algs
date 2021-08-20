package cn.bestlang.algs.concurrent;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class MyAtomicInteger {

    private static Unsafe unsafe;
    private volatile int value;

    private int valueOffset;

    public MyAtomicInteger() {
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            unsafe = (Unsafe) theUnsafe.get(null);
            unsafe.objectFieldOffset(MyAtomicInteger.class.getDeclaredField("value"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public int getAndIncrement() {
        return unsafe.getAndAddInt(this, valueOffset, 1);
    }
}
