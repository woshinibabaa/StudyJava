package share;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * @author yh957
 * 消费者任务
 * 负责检查IntGenerator的数字是否为偶数
 *
 */
public class EvenChecker implements Runnable{
	private IntGenerator generator;
	private final int id ;
	
	/**
	 * 构造函数
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
			//System.out.println("当前线程是"+id+" 当前数字是： " + val);
			System.out.println(val);
			if(val %2 !=0){
				System.out.println(val + "not even!");
				generator.cancel();
			}
		}
	}
	
	
	/**
	 * 产生线程
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
	 * 嘿嘿嘿，这个是不是函数或者构造函数的默认值设置方法233333
	 * @param gp
	 */
	public static void test(IntGenerator gp){
		test(gp,10);
	}
	
	

}
