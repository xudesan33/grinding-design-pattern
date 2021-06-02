package simplefactory.version3;

/**
 * 工厂类，用来创建Api对象
 */
public class Factory {
    /**
     * 具体创建Api对象的方法
     * @return 创建好的Api对象
     */
    public static Api createApi() {
        // 由于只有一个实现，就用条件判断了
        return new Impl();
    }
}
