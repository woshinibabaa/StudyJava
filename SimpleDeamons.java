package ThinkJava;

import java.util.concurrent.TimeUnit;

public class SimpleDeamons implements Runnable {
	
	
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			while(true){
				TimeUnit.MICROSECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" "+this);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("sleep() interrupted");
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for (int i = 0; i < 10; i++) {
			Thread deamon = new Thread(new SimpleDeamons());
			deamon.setDaemon(true);
			deamon.start();
		}
		System.out.println("all deamons started");
		try {
			TimeUnit.MILLISECONDS.sleep(175);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
