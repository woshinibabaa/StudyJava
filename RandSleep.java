package ThinkJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RandSleep implements Runnable{
	
	private int id ;
	private int randTime = 1 ;
	
	Date date = new Date();
	Random random = new Random();	
	
	
	public RandSleep(int id){
		this.id = id;
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������		
		DateFormat format = new SimpleDateFormat("HH:mm:ss");
		try {
			randTime = random.nextInt(1000);
			System.out.println("��ǰʱ���ǣ� "+format.format(date));
			TimeUnit.MILLISECONDS.sleep(randTime);
			System.out.println("#"+id+"˯��ʱ����: "+randTime);
			
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			System.err.println("Interrupted");
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0;i<5;i++){
			exec.execute(new RandSleep(i));
		}
		exec.shutdown();
	}

	

}
