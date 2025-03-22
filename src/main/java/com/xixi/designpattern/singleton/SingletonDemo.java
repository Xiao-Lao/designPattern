package com.xixi.designpattern.singleton;

/**
 * 单例模式演示类
 * 
 * 展示各种单例模式的使用方法和特性
 */
public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("===== 单例模式演示 =====");
        
        System.out.println("\n1. 测试饿汉式单例:");
        // 获取并使用饿汉式单例
        BasicSingleton basicSingleton1 = BasicSingleton.getInstance();
        basicSingleton1.doSomething();
        
        // 再次获取实例，验证是同一个实例
        BasicSingleton basicSingleton2 = BasicSingleton.getInstance();
        System.out.println("实例是否相同: " + (basicSingleton1 == basicSingleton2));
        
        System.out.println("\n2. 测试懒汉式单例:");
        // 在使用时才会初始化
        System.out.println("获取实例前...");
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        lazySingleton1.doSomething();
        
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("实例是否相同: " + (lazySingleton1 == lazySingleton2));
        
        System.out.println("\n3. 测试枚举单例:");
        // 枚举单例的使用
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        enumSingleton1.setData("枚举单例数据");
        enumSingleton1.doSomething();
        
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("设置的数据: " + enumSingleton2.getData());
        System.out.println("实例是否相同: " + (enumSingleton1 == enumSingleton2));
    }
}
