package ThinkJava;

public class DemoT {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i =0 ; i< 5 ;i++){
			new Thread(new TreadTest(i)).start();
		}
		System.out.println("main done!");
	
	}

}
