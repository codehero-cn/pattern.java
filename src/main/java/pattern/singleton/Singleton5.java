package pattern.singleton;

/**
 * 方法5:网友《Android 源码设计模式》一书中还看到一种方式
 * <br>这个好像是用内部类来实现的，听说这个方法最节省资源，也没有线程安全问题
 */

public class Singleton5 {

	private Singleton5() {
	}

	public static synchronized Singleton5 getInstance() {
		return SingletonHolder.instance;
	}

	private static class SingletonHolder {
		private static Singleton5 instance = new Singleton5();

	}

}