package share;
/** 
 * @author yh957
 * 
 * ����������֮�����Դ���ף���һ���߳�ִ�е�++ currentEvenValuesʱ���п�����һ���߳�Ҳ
 * ǡ������ʹ��int��Դ�����µ�ǰ�̸߳��û���ǰ�жϣ�����ʱ��Ͳ����Ĳ���һ��ż��
 */
public class EvenGenetator extends IntGenerator{
	
	private int currentEvenValue = 0;
	
	@Override
	public int next() {
		// TODO �Զ����ɵķ������
		++ currentEvenValue;  // danger point here ?? why ?
		++ currentEvenValue;
		return currentEvenValue;
	}
	
	public static void main(String[] args) {
		EvenChecker.test(new EvenGenetator()); //�����¼���������
	}

}
