package thread21_2_9;
/**
 * ��ͬ�������ڲ����̵߳�Ч����������
 * д�������ô��
 * 
 * @author yh957
 *
 */
public class ThreadVariations {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		new InnerThread1("InnerThread1");
		new InnerThread2("InnerThread2");
		new InnerRunnable("InnerRunnable1");
		new InnerRunnable2("InnerRunnable2");
		new ThreadMethod("ThreadMethod").runTask(); // runTask() ���ɽ��ղ����������������
	}

}
