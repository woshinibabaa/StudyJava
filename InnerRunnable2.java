package thread21_2_9;

import java.util.concurrent.TimeUnit;

/**
 * ʹ������Runnable�ӿ�
 * @author yh957
 *
 */
public class InnerRunnable2 {
	
	private int coutDown =5;
	private Thread t;
	
	public InnerRunnable2(String name) {
		// TODO �Զ����ɵĹ��캯�����
		t = new Thread(
			/**
			 * ����ɶ�Ӳ���������
			 * �������ֲ���������
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
