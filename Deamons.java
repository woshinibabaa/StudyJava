package threadStudy;

import java.util.concurrent.TimeUnit;
/**
 * @author yh957
 * ����һ���̣߳�Ȼ���ڴ�����Deamon�߳����ٴ���10���߳�
 * d�̱߳�����Ϊ��̨�߳�
 * d�߳������������߳�Ҳ�Զ�����Ϊ��̨�߳� * 
 * 123
 */
public class Deamons {

	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		Thread d = new Thread(new Deamon());
		d.setDaemon(true);
		d.start();
		System.out.println("d.isDamon() = "+d.isDaemon() +",");
		TimeUnit.SECONDS.sleep(3);
	}

}
