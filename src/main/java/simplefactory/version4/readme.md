简单工厂方法的内部无外乎就是“选择合适的实现类”来创建对象 选择条件或参数的来源 (1)来源于客户端，有Client传入参数 (2)来源于配置文件，从配置文件中获取用于判断的值 (3)来源于程序运行期间的某个值，比如从缓存中获取某个运行期间的值

缺点： 要求客户端必须知道每一个参数的含义，以及理解每个参数对应功能处理。这就要求必须在一定程度上，向客户暴露一定的内部实现细节