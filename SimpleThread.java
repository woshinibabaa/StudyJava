package thread21_2_9;
/**
 * 21.2.9编码的变体
 * @author yh957
 *
 */
public class SimpleThread extends Thread{
	
	private int countDown =5;
	private static int threadCount = 0;
	
	public SimpleThread(){
		super(Integer.toString(++threadCount));
		start();
	}
	
	@Override
	public String toString(){
		return "#" + getName() +"(" + countDown+ ").";
	}
	
	public void run(){
		while(true){
			System.out.println(this);
			if(--countDown == 0)
				return ;
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=0;i<5;i++)
			new SimpleThread();

	}

}
