package threadStudy;

import java.util.concurrent.TimeUnit;
	/**
	 * 当线程设置为后台线程时，main进程退出，后台进程依旧可以继续运行
	 * 当线程为非后台线程时，main进程退出后，jvm就会关闭所有的后台进程
	 * 所以InterruptedExecption异常抛出
	 * 如果设置目前线程为后台线程，在main函数中休眠等待后台线程运行完成
	 * 即使目前线程为后台线程，也不会抛出InterruptedExeception异常
	 * @author yh957
	 * @version 2017年5月26日20:23:11
	 */
public class DeamonsDontRunFinnally {
	public static void main(String []args) throws InterruptedException{
		Thread t= new Thread(new ADeamon());
		t.setDaemon(true);
		t.start();
		//TimeUnit.SECONDS.sleep(5);
	}
}
