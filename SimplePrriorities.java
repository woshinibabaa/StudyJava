package ThinkJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePrriorities implements Runnable {
	private int countDonw =5;
	private volatile double d;
	private int priority;
	public SimplePrriorities(int priority){
		this.priority = priority;
	}
	
	public String toSting(){		
		return Thread.currentThread()+":"+countDonw;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		Thread.currentThread().setPriority(priority);
		while(true){
			for(int i =1;i<100000;i++){
				d +=(Math.PI +Math.E)/(double)i;
				if(i%100 ==0)
					Thread.yield();
			}
			System.out.println(this.toSting());
			if(--countDonw == 0)return ;
		}
	}
	
	public static void main(String []args){
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0;i<5;i++)
			exec.execute(new SimplePrriorities(Thread.MIN_PRIORITY));		
		exec.execute(new SimplePrriorities(Thread.MIN_PRIORITY));		
		exec.shutdown();
		
	}

}
