package thread21_2_9;
/**
 * 有时候通过内部类来将线程代码隐藏在类中会很有用----Thinking in java page 699
 * 
 * 使用一个命名了的内部类
 * @author yh957
 
 */
public class InnerThread1 {
	private int countDown = 5;
	private Inner inner;
	private class Inner extends Thread{
		/**
		 * 内部类构造函数
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
