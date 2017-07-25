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
		// TODO 自动生成的方法存根		
		DateFormat format = new SimpleDateFormat("HH:mm:ss");
		try {
			randTime = random.nextInt(1000);
			System.out.println("当前时间是： "+format.format(date));
			TimeUnit.MILLISECONDS.sleep(randTime);
			System.out.println("#"+id+"睡眠时间是: "+randTime);
			
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			System.err.println("Interrupted");
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0;i<5;i++){
			exec.execute(new RandSleep(i));
		}
		exec.shutdown();
	}

	

}
