package ThinkJava;

public class BasicThreads {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("wait for liftoff...");
	}

}
