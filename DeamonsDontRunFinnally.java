package threadStudy;

import java.util.concurrent.TimeUnit;
	/**
	 * ���߳�����Ϊ��̨�߳�ʱ��main�����˳�����̨�������ɿ��Լ�������
	 * ���߳�Ϊ�Ǻ�̨�߳�ʱ��main�����˳���jvm�ͻ�ر����еĺ�̨����
	 * ����InterruptedExecption�쳣�׳�
	 * �������Ŀǰ�߳�Ϊ��̨�̣߳���main���������ߵȴ���̨�߳��������
	 * ��ʹĿǰ�߳�Ϊ��̨�̣߳�Ҳ�����׳�InterruptedExeception�쳣
	 * @author yh957
	 * @version 2017��5��26��20:23:11
	 */
public class DeamonsDontRunFinnally {
	public static void main(String []args) throws InterruptedException{
		Thread t= new Thread(new ADeamon());
		t.setDaemon(true);
		t.start();
		//TimeUnit.SECONDS.sleep(5);
	}
}
