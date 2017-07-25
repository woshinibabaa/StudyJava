package share;

/**
 * 
 * @author yh957
 *
 */
public abstract class IntGenerator {
	private volatile boolean canceled = false;
	/**
	 * 抽象类的抽象函数？？
	 * 继承的类里面必须定义方法好像
	 * @return
	 */
	public abstract int next();
	// 允许改变取消的状态
	
	public void cancel(){
		canceled = true;
	}
	
	public boolean isCanceled(){
		return canceled;
	}
}
