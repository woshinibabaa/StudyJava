package thread21_2_9;

import java.util.concurrent.TimeUnit;

/**
 * 使用匿名Runnable接口
 * @author yh957
 *
 */
public class InnerRunnable2 {
	
	private int coutDown =5;
	private Thread t;
	
	public InnerRunnable2(String name) {
		// TODO 自动生成的构造函数存根
		t = new Thread(
			/**
			 * 这是啥子操作？？？
			 * 还有这种操作？？？
			 */
			new Runnable(){
			public void run(){
				try {
					while(true){
						System.out.println(this);
						if(--coutDown == 0)return;
						TimeUnit.MILLISECONDS.sleep(10);
					}
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("sleep() interrupted");
				}
			}
			
			public String toString(){
				return Thread.currentThread().getName()+ ":" +coutDown;
			}			
		},name);
		t.start();
	}	
}
