package threadStudy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �򵥵��߳����ȼ�����
 * @author hydra_xhu
 *
 */
public class SimplePriorities implements Runnable {
	
	private int countDown = 5;	
	private volatile double d;
	private int proiority;
	
	public  SimplePriorities(int proiority) {
		// TODO �Զ����ɵĹ��캯�����
		this.proiority = proiority;
	}
	
	@Override
	public String toString(){
		return Thread.currentThread() + ":" + countDown;		
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		//�������������ȼ�
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
		// TODO �Զ����ɵķ������
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0 ;i<5;i++)
			exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		exec.shutdown();
		
	}

}
