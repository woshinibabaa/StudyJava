package ThinkJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i =0;i<4;i++){
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}

}
