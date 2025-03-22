/**
 * 单例模式 - 基础实现
 * 
 * 这是单例模式的最简单实现，使用了饿汉式（Eager Initialization）方式。
 * 类加载时就创建实例，线程安全，但不能延迟加载。
 */
public class BasicSingleton {
    // 1. 私有静态实例，在类加载时就创建
    private static final BasicSingleton INSTANCE = new BasicSingleton();
    
    // 2. 私有构造函数，防止外部创建实例
    private BasicSingleton() {
        System.out.println("BasicSingleton 被实例化");
    }
    
    // 3. 公共静态方法，提供全局访问点
    public static BasicSingleton getInstance() {
        return INSTANCE;
    }
    
    // 类的业务方法
    public void doSomething() {
        System.out.println("BasicSingleton 执行业务逻辑");
    }
}
