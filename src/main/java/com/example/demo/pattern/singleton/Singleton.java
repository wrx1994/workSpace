package com.example.demo.pattern.singleton;

public class Singleton {

    private Singleton(){}

    /**
     * 恶汉式
     * 缺点：无法完成延迟加载
     * 即当系统还没有用到此单例时，单例就会被加载到内存中。
     */
    private static Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }

    /**
     * 懒汉式
     */
    private static Singleton singletonB;
    public static synchronized Singleton getSingletonB(){
        if(singletonB == null){
            singletonB = new Singleton();
        }
        return singletonB;
    }

    /**
     * 双重加锁机制
     */
    private static Singleton singletonC;
    public static Singleton getSingletonC(){
        if(singletonC == null){
            synchronized (Singleton.class){
                if(singletonC==null)
                    singletonC = new Singleton();
            }
        }
        return singletonC;
    }

    private static class SingletonE {
        private static final Singleton singletonE = new Singleton();
    }
    public static final Singleton getInstance(){
       return SingletonE.singletonE;
    }
}
