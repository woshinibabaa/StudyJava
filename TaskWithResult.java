package ThinkJava;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String> {
	private int id;	

	public TaskWithResult(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public String call() throws Exception {
		// TODO �Զ����ɵķ������
		return "result of TaskWithResult "+id;
	}

}
