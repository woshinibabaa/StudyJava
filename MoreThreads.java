package ThinkJava;

public class MoreThreads {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for (int i = 0; i < 5; i++) {
			new Thread(new LiftOff()).start();;
		System.out.println("waiting for lift.........");
		}
	}

}
