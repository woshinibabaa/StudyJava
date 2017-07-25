package ThinkJava;

public class MyThread implements Runnable{
	private String startMsg;
	private String endMsg;
	
	
	public MyThread(String startMsg, String endMsg) {
		super();
		this.startMsg = startMsg;
		this.endMsg = endMsg;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println(this+startMsg+" start");		
		for(int i =0;i<3;i++){
			System.out.println("run #"+ i);
			Thread.yield();			
		}
		System.out.println(this+endMsg +" end???");
	}
	
	public static void main(String []arg){
		MyThread mt = new MyThread("a", "b");
		Thread t1 = new Thread(mt);
		t1.start();
		Thread t2 = new Thread(mt);
		t2.start();
		Thread t3 = new Thread(mt);
		t3.start();
		
	}

}
