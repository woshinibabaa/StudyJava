package ThinkJava;

public class TreadTest implements Runnable{
	private int id ;
	
	public TreadTest(){}
	
	public TreadTest(int id){
		this.id = id;
	}
	
	@Override
	public void run() { 
		// TODO �Զ����ɵķ������
		System.out.println("���ǵ�#"+id+"���߳�");
	}
	
	


}
