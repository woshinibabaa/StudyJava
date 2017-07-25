package threadStudy;

import java.util.concurrent.TimeUnit;
/**
 * 后台线程测试类
 * @author yh957
 * @time 2017年5月26日20:23:45
 *
 */
public class ADeamon implements Runnable {
	public void run(){
		try {
			System.out.println("Staring ADeamon");
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			System.out.println("Exiting via InterruptedExeception");
		}finally {
			// TODO: handle finally clause
			System.out.println("This should always run ???");
		}
	}
}
