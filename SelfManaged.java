package thread21_2_9;
/**
 * 可以通过调用适当的Thread构造器为Thread对象赋予具体的名称
 * 这个名称可以通过使用getName()从toString()中获得
 * 另一种可能会看到的惯用法时自管理的Runnable
 * @author yh957
 *
 */
public class SelfManaged implements Runnable {
	
	private int countDown = 5;
	private Thread t = new Thread(this);
	public  SelfManaged() {
		// TODO 自动生成的构造函数存根
		t.start();
	}
	
	public String toString(){
		return Thread.currentThread().getName()+ "("+ countDown+").";		
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true){
			System.out.println(this);
			if(-- countDown == 0)
				return ;
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=0;i<5;i++)
			new SelfManaged();

	}

}
