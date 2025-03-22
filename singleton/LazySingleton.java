/**
 * 单例模式 - 懒汉式实现
 * 
 * 这是单例模式的延迟加载实现，使用双重检查锁定（Double-Checked Locking）
 * 确保线程安全的同时提供延迟初始化能力。
 */
public class LazySingleton {
    // 1. 私有静态实例，使用volatile关键字确保多线程可见性
    private static volatile LazySingleton instance;
    
    // 2. 私有构造函数
    private LazySingleton() {
        System.out.println("LazySingleton 被实例化");
    }
    
    // 3. 公共静态方法，使用双重检查锁定
    public static LazySingleton getInstance() {
        // 第一次检查，避免不必要的同步
        if (instance == null) {
            // 同步锁
            synchronized (LazySingleton.class) {
                // 第二次检查，避免多线程问题
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
    
    public void doSomething() {
        System.out.println("LazySingleton 执行业务逻辑");
    }
}
