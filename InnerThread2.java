package thread21_2_9;
/**
 * ʹ��һ�������ڲ���
 * @author yh957
 *
 */
public class InnerThread2 {
	
	private int countDown = 5;
	private Thread t;
	
	/**
	 * ���캯��
	 * @param name
	 */
	public InnerThread2(String name){
		t = new Thread(name)
		// �����ڲ��ࡣ������
		// ����ɶ�Ӳ�����
		{
			public void run(){
				try {
					while(true){
						System.out.println(this);
						if(-- countDown == 0)return ;
						sleep(10);
					}
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("sleep() interrupted");
				}
			}
			public String toString(){
				return getName()+ ":" +countDown;
			}
		};
		t.start();
	}

}
