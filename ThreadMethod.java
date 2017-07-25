package thread21_2_9;
/**
 * A separate method to run some coke as task
 * 好像是用一个方法来启动线程哈？
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
			 * 这里好像是个匿名类，和前面那个innerThread2 差不多好像。
			 * 不能通过对象直接启动线程，需要调用方法
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
