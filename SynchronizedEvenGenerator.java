package share;
/**
 * Synchronized（隐式）关键字给线程加锁
 *@author yh957
 *@version 时间 2017年6月1日下午10:24:44
 *
 */
public class SynchronizedEvenGenerator extends IntGenerator{

private  int currentEvenValue = 0;
	

	@Override
	/**
	 * @Override
	 * 第一个进入next()的线程会活动一个锁，其他线程尝试访问时会被阻塞
	 */
	public synchronized int next() {
		// TODO 自动生成的方法存根
		++ currentEvenValue;
		//Thread.yield();   // 搁置线程
		++ currentEvenValue;
		return currentEvenValue;
	}
	
	public static void main(String[] args) {
		EvenChecker.test(new SynchronizedEvenGenerator());
	}
}
