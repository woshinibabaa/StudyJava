package share;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * @author yh957
 * ����������
 * ������IntGenerator�������Ƿ�Ϊż��
 *
 */
public class EvenChecker implements Runnable{
	private IntGenerator generator;
	private final int id ;
	
	/**
	 * ���캯��
	 * @param g 
	 * @param ident
	 */
	public EvenChecker(IntGenerator g,int ident){
		generator = g;
		id = ident;
	}
	
	@Override	
	public void run(){
		while(!generator.isCanceled()){
			int val = generator.next();
			//System.out.println("��ǰ�߳���"+id+" ��ǰ�����ǣ� " + val);
			System.out.println(val);
			if(val %2 !=0){
				System.out.println(val + "not even!");
				generator.cancel();
			}
		}
	}
	
	
	/**
	 * �����߳�
	 * @param gp
	 * @param count
	 */
	public static void test(IntGenerator gp,int count){
		System.out.println("Press Control-c exit");
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0;i<count;i++)
			exec.execute(new EvenChecker(gp, i));
		exec.shutdown();		
	}
	/**
	 * �ٺٺ٣�����ǲ��Ǻ������߹��캯����Ĭ��ֵ���÷���233333
	 * @param gp
	 */
	public static void test(IntGenerator gp){
		test(gp,10);
	}
	
	

}
