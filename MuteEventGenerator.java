package share;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ��ʾ�ļ��߳���
 *@author yh957
 *@version ʱ�� 2017��6��1������10:34:25
 *
 */
public class MuteEventGenerator extends IntGenerator {

	private int currentEvenValue = 0;
	private Lock lock = new ReentrantLock();
	
	
	@Override
	public int next(){
		lock.lock();   // �����߳�
		try {
			++ currentEvenValue; 
			Thread.yield();
			++ currentEvenValue;
			return currentEvenValue;
		} finally {
			// TODO: handle finally clause
			lock.unlock();  // ������ϣ������̣߳��������߳�ʹ��
		}
	}
	
//	@Override
//	public int next() {
//		// TODO �Զ����ɵķ������
//		++ currentEvenValue;  // danger point here ?? why ?
//		++ currentEvenValue;
//		return currentEvenValue;
//	}
	
	public static void main(String[] args) {
		EvenChecker.test(new MuteEventGenerator());
	}


}
