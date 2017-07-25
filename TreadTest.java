package ThinkJava;

public class TreadTest implements Runnable{
	private int id ;
	
	public TreadTest(){}
	
	public TreadTest(int id){
		this.id = id;
	}
	
	@Override
	public void run() { 
		// TODO 自动生成的方法存根
		System.out.println("这是第#"+id+"条线程");
	}
	
	


}
