package share;
/**
 * Synchronized����ʽ���ؼ��ָ��̼߳���
 *@author yh957
 *@version ʱ�� 2017��6��1������10:24:44
 *
 */
public class SynchronizedEvenGenerator extends IntGenerator{

private  int currentEvenValue = 0;
	

	@Override
	/**
	 * @Override
	 * ��һ������next()���̻߳�һ�����������̳߳��Է���ʱ�ᱻ����
	 */
	public synchronized int next() {
		// TODO �Զ����ɵķ������
		++ currentEvenValue;
		//Thread.yield();   // �����߳�
		++ currentEvenValue;
		return currentEvenValue;
	}
	
	public static void main(String[] args) {
		EvenChecker.test(new SynchronizedEvenGenerator());
	}
}
