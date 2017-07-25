package thread21_2_9;
/**
 * ����ͨ�������ʵ���Thread������ΪThread��������������
 * ������ƿ���ͨ��ʹ��getName()��toString()�л��
 * ��һ�ֿ��ܻῴ���Ĺ��÷�ʱ�Թ����Runnable
 * @author yh957
 *
 */
public class SelfManaged implements Runnable {
	
	private int countDown = 5;
	private Thread t = new Thread(this);
	public  SelfManaged() {
		// TODO �Զ����ɵĹ��캯�����
		t.start();
	}
	
	public String toString(){
		return Thread.currentThread().getName()+ "("+ countDown+").";		
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true){
			System.out.println(this);
			if(-- countDown == 0)
				return ;
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=0;i<5;i++)
			new SelfManaged();

	}

}
