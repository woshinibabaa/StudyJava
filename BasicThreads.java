package ThinkJava;

public class BasicThreads {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("wait for liftoff...");
	}

}
