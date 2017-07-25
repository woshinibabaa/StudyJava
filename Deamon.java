package threadStudy;

public class Deamon implements Runnable {
	/**
	 * 用来创建另外的线程
	 * @author yh957
	 */
	
	private Thread[] t = new Thread[10];
	
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<t.length;i++){
			t[i] = new Thread(new DeamonSpawn());
			t[i].start();
			System.out.println("DeamonSpawn "+ i +"started. " );
		}
		for(int i=0;i<t.length;i++)
			System.out.println("t["+ i + "].isDeamon() = " + t[i].isDaemon()+",");
		while(true)
			Thread.yield();
	}

}
