package com.xixi.designpattern.singleton;

/**
 * 单例模式 - 枚举实现
 * 
 * 这是Java推荐的实现单例的方式，使用枚举。
 * 枚举天然就是单例的，并且能够防止反射、序列化攻击。
 */
public enum EnumSingleton {
    // 单例实例
    INSTANCE;
    
    // 可以定义私有变量
    private String data;
    
    // 枚举的构造函数默认是私有的
    EnumSingleton() {
        System.out.println("com.xixi.designpattern.singleton.EnumSingleton 被实例化");
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public void doSomething() {
        System.out.println("com.xixi.designpattern.singleton.EnumSingleton 执行业务逻辑");
    }
}
