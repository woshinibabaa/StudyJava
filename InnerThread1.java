package thread21_2_9;
/**
 * ��ʱ��ͨ���ڲ��������̴߳������������л������----Thinking in java page 699
 * 
 * ʹ��һ�������˵��ڲ���
 * @author yh957
 
 */
public class InnerThread1 {
	private int countDown = 5;
	private Inner inner;
	private class Inner extends Thread{
		/**
		 * �ڲ��๹�캯��
		 * @param name
		 */
		Inner(String name){
			super(name);
			start();
		}
		
		public void run(){
			try {
				while(true){
					System.out.println(this);
					if(--countDown == 0)return;
					sleep(10);
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("interrupted");
			}
		}
		
		public String toString(){
			return getName()+ ": "+ countDown;
		}		
	}
	
	public InnerThread1(String name){
		inner = new Inner(name);
	}
}
