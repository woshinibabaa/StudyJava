package threadStudy;

/**
 * @author yh957
 * �����Ĳ����̣߳���û����ʾ������Ϊ��̨�߳�
 * ���ڴ������߳�Ϊ��̨�߳�
 * ��������߳�Ĭ������Ϊ��̨�߳�
 */

public class DeamonSpawn implements Runnable {
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true)
			Thread.yield();
	}

}
