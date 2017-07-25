package share;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 * 去你妈的锁
 *@author yh957
 *@version 时间 2017年6月1日下午10:45:16
 *
 */

public class AttempLocking {
	
	private ReentrantLock lock = new ReentrantLock();
	
	public void untimed(){
		boolean captured = lock.tryLock();
		try {
			System.out.println("tryLock():"+ captured);
		} finally {
			// TODO: handle finally clause
			if(captured)
				lock.unlock();
		}
	}
	
	public void timed(){
		boolean captured = false;
		try {
			captured = lock.tryLock(2, TimeUnit.SECONDS);
			//System.out.println(captured);
		} catch (InterruptedException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		try {
			System.out.println("tryLock(2, TimeUnit.SECONDS)" + captured);
		} finally {
			// TODO: handle finally clause
			if(captured)
				lock.unlock();
		}
	}
	
	public static void main(String []args){
		final AttempLocking al = new AttempLocking();
		al.untimed(); // 真--锁已激活
		al.timed();   // 真--锁已激活		
		new Thread(){
			{
				//setDaemon(true);
				setPriority(MAX_PRIORITY);
			}			
			public void run(){				
				al.lock.lock();
				System.out.println("acquired!");
			}			
		}.start();
		Thread.yield();
		al.untimed();
		al.timed();
	}
}