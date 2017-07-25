package thread21_2_9;
/**
 * A separate method to run some coke as task
 * ��������һ�������������̹߳���
 * @author yh957
 *
 */
public class ThreadMethod {
	private int countDown =5;
	private Thread t;
	private String name;
	
	
	public ThreadMethod(String name){
		this.name = name;
	}
	
	public void runTask(){
		if(t == null){
			t = new Thread(name)
			/**
			 * ��������Ǹ������࣬��ǰ���Ǹ�innerThread2 ������
			 * ����ͨ������ֱ�������̣߳���Ҫ���÷���
			 */
			{
				public void run(){
					try {
						while(true){
							System.out.println(this);
							if(-- countDown == 0)return;
							sleep(10);
						}
					} catch (InterruptedException e) {
						// TODO: handle exception
						System.out.println("sleep() interrupted");
					}
				}
				public String toString(){
					return getName() + ": " +countDown;
				}
			};
			t.start();
		}
	}
	
}
