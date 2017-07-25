package threadStudy;

/**
 * @author yh957
 * 创建的测试线程，并没有显示的设置为后台线程
 * 由于创建的线程为后台线程
 * 所以这个线程默认设置为后台线程
 */

public class DeamonSpawn implements Runnable {
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true)
			Thread.yield();
	}

}
