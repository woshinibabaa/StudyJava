package threadStudy;

import java.util.concurrent.TimeUnit;
/**
 * @author yh957
 * 创建一个线程，然后在创建的Deamon线程中再创建10个线程
 * d线程被设置为后台线程
 * d线程所创建的新线程也自动设置为后台线程 * 
 * 123
 */
public class Deamons {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		Thread d = new Thread(new Deamon());
		d.setDaemon(true);
		d.start();
		System.out.println("d.isDamon() = "+d.isDaemon() +",");
		TimeUnit.SECONDS.sleep(3);
	}

}
