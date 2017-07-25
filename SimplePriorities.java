package threadStudy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 简单的线程优先级控制
 * @author hydra_xhu
 *
 */
public class SimplePriorities implements Runnable {
	
	private int countDown = 5;	
	private volatile double d;
	private int proiority;
	
	public  SimplePriorities(int proiority) {
		// TODO 自动生成的构造函数存根
		this.proiority = proiority;
	}
	
	@Override
	public String toString(){
		return Thread.currentThread() + ":" + countDown;		
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		//好像是设置优先级
		Thread.currentThread().setPriority(proiority);
		while(true){
			for(int i =1 ;i<100000;i++){
				d +=(Math.PI+Math.E)/(double)i;
				if(i%100==0)
					Thread.yield();			
			}
			System.out.println(this);
			if(--countDown == 0)return ;
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0 ;i<5;i++)
			exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		exec.shutdown();
		
	}

}
