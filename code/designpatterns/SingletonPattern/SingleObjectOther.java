/**
 * 懒汉式，不是线程安全的
 * 在初始化时有线程安全问题
 */

class Singleton1 {

    private static Singleton1 instance;
    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

/**
 * 懒汉式，线程安全的
 * 
 */
class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    /**
     * 使用synchronized保证线程安全
     * @return Singleton2
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

/**
 * 饿汉式，线程安全
 */
class Singleton3 {

    /**先将类静态变量初始化，保证一个contextloader只有一个类的实例 */
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}

/**
 * 双检锁/双重校验锁(DCL,double-checked locking)
 * JDK1.5及以后
 */
class Singleton4 {
    //变量是线程安全的
    private volatile static Singleton4 singleton;

    private Singleton4() {
    }

    public static Singleton4 getSingleton() {
        if (singleton == null) {
            //以自身的类文件做为锁，保证锁的唯一性
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}

/**
 * 登记式静态内部类
 * 即实现了类懒加载，又可以保证线程安全，使用了内部静态类，只有在主动调用时才会实例单例类。
 */
class Singleton5 {

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
