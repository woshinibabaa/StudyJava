package share;

/**
 * 
 * @author yh957
 *
 */
public abstract class IntGenerator {
	private volatile boolean canceled = false;
	/**
	 * ������ĳ���������
	 * �̳е���������붨�巽������
	 * @return
	 */
	public abstract int next();
	// ����ı�ȡ����״̬
	
	public void cancel(){
		canceled = true;
	}
	
	public boolean isCanceled(){
		return canceled;
	}
}
