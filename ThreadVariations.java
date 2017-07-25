package thread21_2_9;
/**
 * 不同隐藏在内部的线程的效果。。。。
 * 写你麻痹那么多
 * 
 * @author yh957
 *
 */
public class ThreadVariations {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		new InnerThread1("InnerThread1");
		new InnerThread2("InnerThread2");
		new InnerRunnable("InnerRunnable1");
		new InnerRunnable2("InnerRunnable2");
		new ThreadMethod("ThreadMethod").runTask(); // runTask() 还可接收参数，这个操作可以
	}

}
