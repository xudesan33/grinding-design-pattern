package singleton.version3.cacahe;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用缓存来模拟实现单例
 */
public class Singleton {
    /**
     * 定义一个默认的Key值,用来标识在缓存中的存放
     */
    private final static String DEFAULT_KEY = "One";
    /**
     * 缓存实例的容器
     */
    private static Map<String,Singleton> map = new HashMap<>();

    /**
     * 私有化构造方法
     */
    private Singleton() {
        //
    }
    public static Singleton getInstance() {
        // 先从缓存中获取
        Singleton instance = (Singleton) map.get(DEFAULT_KEY);
        // 如果没有,就新建一个,然后设置回缓存中
        if (instance == null){
            instance = new Singleton();
            map.put(DEFAULT_KEY,instance);
        }
        return instance;
    }
}
