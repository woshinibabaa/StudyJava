package thread21_2_9;
/**
 * 使用一个匿名内部类
 * @author yh957
 *
 */
public class InnerThread2 {
	
	private int countDown = 5;
	private Thread t;
	
	/**
	 * 构造函数
	 * @param name
	 */
	public InnerThread2(String name){
		t = new Thread(name)
		// 匿名内部类。。。。
		// 这是啥子操作？
		{
			public void run(){
				try {
					while(true){
						System.out.println(this);
						if(-- countDown == 0)return ;
						sleep(10);
					}
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("sleep() interrupted");
				}
			}
			public String toString(){
				return getName()+ ":" +countDown;
			}
		};
		t.start();
	}

}
