package singleton;

public class Singleton2 {
	/* 私有构造方法，防止被实例化 */
	private Singleton2(){
	}
	/* 此处使用一个内部类来维护单例 */
	private static class SingletonHolder{
		private static final Singleton2 instance = new Singleton2();
	}
	/* 获取实例 */
	public static Singleton2 getInstance(){
		return SingletonHolder.instance;
	}
}
