package share;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 显示的加线程锁
 *@author yh957
 *@version 时间 2017年6月1日下午10:34:25
 *
 */
public class MuteEventGenerator extends IntGenerator {

	private int currentEvenValue = 0;
	private Lock lock = new ReentrantLock();
	
	
	@Override
	public int next(){
		lock.lock();   // 锁上线程
		try {
			++ currentEvenValue; 
			Thread.yield();
			++ currentEvenValue;
			return currentEvenValue;
		} finally {
			// TODO: handle finally clause
			lock.unlock();  // 运行完毕，解锁线程，给其他线程使用
		}
	}
	
//	@Override
//	public int next() {
//		// TODO 自动生成的方法存根
//		++ currentEvenValue;  // danger point here ?? why ?
//		++ currentEvenValue;
//		return currentEvenValue;
//	}
	
	public static void main(String[] args) {
		EvenChecker.test(new MuteEventGenerator());
	}


}
