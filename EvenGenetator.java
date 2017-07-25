package share;
/** 
 * @author yh957
 * 
 * 由于两个类之间的资源贡献，当一个线程执行到++ currentEvenValues时，有可能另一个线程也
 * 恰好正在使用int资源，导致当前线程搁置或提前中断，这是时候就产生的不是一个偶数
 */
public class EvenGenetator extends IntGenerator{
	
	private int currentEvenValue = 0;
	
	@Override
	public int next() {
		// TODO 自动生成的方法存根
		++ currentEvenValue;  // danger point here ?? why ?
		++ currentEvenValue;
		return currentEvenValue;
	}
	
	public static void main(String[] args) {
		EvenChecker.test(new EvenGenetator()); //传入事件产生对象
	}

}
