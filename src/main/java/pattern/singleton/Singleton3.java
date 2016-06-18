package pattern.singleton;

/**
 * 方法3:单例模式的实现：饱汉式,线程安全简单实现
 * <br>优点是：使用synchronized关键字避免多线程访问时，出现多个SingletonTest实例。
 * <br>缺点是：同步方法频繁调用时，效率略低。
 * @author eleven
 *
 */
public class Singleton3 {
	
	private Singleton3() {
	}

	// 不初始化，注意这里没有使用final关键字
	private static Singleton3 s;
	
	// 定义一个静态的方法（调用时再初始化Singleton，使用synchronized 避免多线程访问时，可能造成重复初始化问题）
    public static synchronized  Singleton3 getInstance() {   
        if (s == null)   
            s = new Singleton3();   
        return s;   
    }   
}
