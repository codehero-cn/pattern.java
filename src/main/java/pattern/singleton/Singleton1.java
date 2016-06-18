package pattern.singleton;
/**
 * 方法1:单例模式的实现：饿汉式,线程安全 但效率比较低 
 * <br>优点是：写起来比较简单，而且不存在多线程同步问题，避免了synchronized所造成的性能问题；
 * <br>缺点是：当类SingletonTest被加载的时候，会初始化static的instance，静态变量被创建并分配内存空间，
 * <br>从这以后， 这个static的instance对象便一直占着这段内存（即便你还没有用到这个实例），
 * <br>当类被卸载时，静态变量被摧毁，并释放所占有的内存，因此在某些特定条件下会耗费内存。
 * @author eleven
 *
 */
public class Singleton1 {
	
	//在其内部产生该类的实例化对象，并将其封装成private static类型。
	private static final Singleton1 s = new Singleton1();
	
	
	private Singleton1(){
		
	}
	
	//定义一个静态方法返回该类的实例
	public static Singleton1 getInstance(){

		return s;
	}
}
