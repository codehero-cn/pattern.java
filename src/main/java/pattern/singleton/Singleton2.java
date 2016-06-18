package pattern.singleton;
/**
 * 方法2:单例模式的实现：饱汉式,非线程安全   
 * <br>优点是：写起来比较简单，当类SingletonTest被加载的时候，静态变量static的instance未被创建
 * <br>并分配内存空间，当getInstance方法第一次被调用时，初始化instance变量，并分配内存，
 * <br>因此在某些特定条件下会节约了内存；
 * <br>缺点是：并发环境下很可能出现多个SingletonTest实例。
 * @author eleven
 *
 */
public class Singleton2 {
	
	private Singleton2(){
	}
	
	//不初始化，注意这里没有使用final关键字
	private static Singleton2 s;
	
	//定义一个静态的方法（调用时再初始化Singleton，但是多线程访问时，可能造成重复初始化问题）
	public static Singleton2 getInstance(){
		if (s == null){
			s = new Singleton2();
		}
		return s;
	}
}
