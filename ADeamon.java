package threadStudy;

import java.util.concurrent.TimeUnit;
/**
 * ��̨�̲߳�����
 * @author yh957
 * @time 2017��5��26��20:23:45
 *
 */
public class ADeamon implements Runnable {
	public void run(){
		try {
			System.out.println("Staring ADeamon");
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			System.out.println("Exiting via InterruptedExeception");
		}finally {
			// TODO: handle finally clause
			System.out.println("This should always run ???");
		}
	}
}
