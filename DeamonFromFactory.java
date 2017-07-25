package threadStudy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeamonFromFactory implements Runnable {

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			TimeUnit.MILLISECONDS.sleep(100);
			System.out.println(Thread.currentThread()+" "+this);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("interrupted");
		}
	}

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		ExecutorService exec = Executors.newCachedThreadPool(new DeamonThreadFactory());
		for(int i =0;i<10;i++)
			exec.execute(new DeamonFromFactory());
		System.out.println("all deamons started");
		TimeUnit.MILLISECONDS.sleep(500);
	}

}
