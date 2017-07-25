package thread21_2_9;

import java.util.concurrent.TimeUnit;

/**
 * ʹ��һ�������˵�Runnable �ӿڣ�����
 * @author yh957
 *
 */
public class InnerRunnable {

	private int countDown = 5;
	private Inner inner ;
	/**
	 * �ڲ���
	 * @author yh957
	 *
	 */
	private class Inner implements Runnable{
		Thread t;
		Inner(String name){
			t = new Thread(this,name);
			t.start();
		}
		
		@Override
		public void run(){
			try {
				while(true){
					System.out.println(this);
					if(-- countDown == 0)return ;
					TimeUnit.MILLISECONDS.sleep(10);
				}
			} catch (InterruptedException  e) {
				// TODO: handle exception
				System.out.println("sleep() interrupted");
			}
		}
		
		public String toString(){
			return t.getName() +":"+ countDown;
		}
	}
	/**
	 * �ⲿ��Ĺ��캯��
	 */
	public InnerRunnable(String name){
		inner  = new Inner(name);
	}
}
